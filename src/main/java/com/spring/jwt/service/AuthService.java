package com.spring.jwt.service;

import com.spring.jwt.entity.AuthResponse;
import com.spring.jwt.entity.LoginRequest;
import com.spring.jwt.entity.RegisterRequest;
import com.spring.jwt.jwt.JwtService;
import com.spring.jwt.repository.UserRespository;
import com.spring.jwt.user.Role;
import com.spring.jwt.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRespository userRespository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        User user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .lastname(request.getLastname())
                .firstname(request.getFirstname())
                .country(request.getCountry())
                .role(Role.USER)
                .build();

        userRespository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();
    }

}
