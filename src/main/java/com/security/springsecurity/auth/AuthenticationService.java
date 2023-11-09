package com.security.springsecurity.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        return null;
    }

    public AuthenticationResponse register(RegisterRequest request) {
        return null;
    }
}
