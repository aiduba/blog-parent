package com.blog.security.model.token;

import com.blog.security.exceptions.ExpiredTokenException;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.BadCredentialsException;

public class RawAccessToken implements Token {

    private static Logger logger = LoggerFactory.getLogger(RawAccessToken.class);

    private String token;

    public RawAccessToken(String token) {
        this.token = token;
    }

    /**
     * 分析并且验证Token是否有效
     *
     * @throws BadCredentialsException 如果验证请求被拒绝，则因为凭据无效 <br> 对于要抛出的异常，它意味着该帐户既不锁定也不禁用。 <br>
     * @throws ExpiredTokenException   过期的Token
     */
    public Jws<Claims> parseClaims(String signingKey) {
        try {
            return Jwts.parser().setSigningKey(signingKey).parseClaimsJws(this.token);
        } catch (UnsupportedJwtException | MalformedJwtException | IllegalArgumentException | SignatureException ex) {
            logger.error("无效令牌", ex);
            throw new BadCredentialsException("无效令牌: ", ex);
        } catch (ExpiredJwtException expiredEx) {
            logger.info("令牌过期", expiredEx);
            throw new ExpiredTokenException(this, "无效令牌", expiredEx);
        }
    }

    @Override
    public String getToken() {
        return token;
    }
}
