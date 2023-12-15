package com.spring.jwt.service;

import com.spring.jwt.entity.AuthResponse;
import com.spring.jwt.entity.LoginRequest;
import com.spring.jwt.entity.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        return null;
    }

}
