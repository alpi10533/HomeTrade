package com.isep.hometrade.service;

import com.isep.hometrade.business.UserEntity;
import com.isep.hometrade.dao.UserRepository;
import com.isep.hometrade.map.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void saveUser(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstname(userDto.getFirstname());
        userEntity.setLastname(userDto.getLastname());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userEntity.setType("Utilisateur");
        userRepository.save(userEntity);
    }

    public UserEntity findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
