package com.michelet.common.auth.core.context;

import com.michelet.common.auth.core.enums.UserRole;

public record UserContext(
        String userId,
        UserRole role
) {
    public boolean hasRole(UserRole expectedRole) {
        return role != null && role == expectedRole;
    }

    public boolean isAuthenticated() {
        return userId != null && !userId.isBlank();
    }
}
