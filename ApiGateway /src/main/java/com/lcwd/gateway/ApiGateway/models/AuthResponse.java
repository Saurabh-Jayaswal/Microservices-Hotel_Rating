package com.lcwd.gateway.ApiGateway.models;

import lombok.*;
import org.springframework.http.ResponseEntity;

import java.util.Collection;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String userId;
    private String accessToken;
    private String resfreshToken;
    private long expireAt;

    private Collection<String> authories;
}
