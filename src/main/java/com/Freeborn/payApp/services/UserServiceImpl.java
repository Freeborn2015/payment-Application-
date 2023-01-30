package com.Freeborn.payApp.services;

import com.Freeborn.payApp.dtos.requests.UserRegistrationRequest;
import com.Freeborn.payApp.models.User;
import com.Freeborn.payApp.repositories.UserRepository;
import com.Freeborn.payApp.validations.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public String register(UserRegistrationRequest userRegistrationRequest) {
        if(!Validator.isValidPassword(userRegistrationRequest.getPassword()))throw new RuntimeException("Password is weak");
        if(!Validator.isValidEmail(userRegistrationRequest.getEmail()))throw new RuntimeException("Email format is weak");
        if( userRepository.findUserByEmail(userRegistrationRequest.getEmail())
                .isPresent()) throw  new RuntimeException("email already exists");
        User user = new User();
        user.setFirstName(userRegistrationRequest.getFirstName());
        user.setLastName(userRegistrationRequest.getLastName());
        user.setEmail(userRegistrationRequest.getEmail());
        user.setPassword(userRegistrationRequest.getPassword());
        userRepository.save(user);

        return "registration successful";
    }
}
