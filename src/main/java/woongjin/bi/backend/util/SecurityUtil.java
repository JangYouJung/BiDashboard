package woongjin.bi.backend.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Slf4j
public class SecurityUtil {
    public static String getCurrentUserName() {
        final Authentication authentication = SecurityContextHolder.getContext()
                .getAuthentication();

        if (authentication == null || authentication.getName() == null) {
            throw new IllegalArgumentException("Security Context 에 인증 정보가 없습니다.");
        }

        return authentication.getName();
    }
}