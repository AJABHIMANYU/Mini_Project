package com.newust.Car_authentication.service;

import com.newust.Car_authentication.entity.UserCredentialsEntity;
import com.newust.Car_authentication.repository.UserCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserCredentialsService {

    @Autowired
    JwtService jwtService;

    @Autowired
    UserCredentialsRepository authDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserCredentialsEntity register(UserCredentialsEntity user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return authDao.save(user);
    }

    public String generateToken(String name) {
        return jwtService.generateToken(name);
    }

    public boolean verifyToken(String token) {
        jwtService.validateToken(token);
        return true;
    }
}


