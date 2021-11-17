package com.rest.services;

import com.rest.dto.CredentialsDto;
import com.rest.dto.UserDto;
import org.springframework.stereotype.Service;


import org.springframework.security.crypto.password.PasswordEncoder;

import java.nio.CharBuffer;

@Service
public class AuthenticationService {

    private final PasswordEncoder passwordEncoder;

    public AuthenticationService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public UserDto authenticate(CredentialsDto credentialsDto) {
        String encodedMasterPassword = passwordEncoder.encode(CharBuffer.wrap("random-password"));
        if (passwordEncoder.matches(CharBuffer.wrap(credentialsDto.getPassword()), encodedMasterPassword)) {
            return new UserDto(1L, "Alexander", "Gadzhalov", "login", "token");
        }
        throw new RuntimeException("Invalid password");
    }

    public UserDto findByLogin(String login) {
        if ("login".equals(login)) {
            return new UserDto(1L, "Alexander", "Gadzhalov", "login", "token");
        }
        throw new RuntimeException("Invalid login");
    }
}