package com.spring.jwt.service;

import com.spring.jwt.entity.AuthResponse;
import com.spring.jwt.entity.LoginRequest;
import com.spring.jwt.entity.RegisterRequest;
import com.spring.jwt.repository.UserRespository;
import com.spring.jwt.user.Role;
import com.spring.jwt.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRespository userRespository;

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        User user = User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .lastname(request.getLastname())
                .firstname(request.getFirstname())
                .country(request.getCountry())
                .role(Role.USER)
                .build();

        userRespository.save(user);
        return AuthResponse.builder()
                .token()
                .build();
    }

}
