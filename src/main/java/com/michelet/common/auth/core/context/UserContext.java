package com.michelet.common.auth.core.context;

public record UserContext(
        String userId,
        String role
) {
    public boolean hasRole(String expectedRole){
        return role != null && role.equals(expectedRole);
    }

    public boolean isAuthenticated(){
        return userId != null && !userId.isBlank();
    }
}
