package com.springsecuritydata1.springsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RefreshTokenRequest {
    private String refreshToken;
}
