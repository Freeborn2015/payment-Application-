package com.Freeborn.payApp;

import com.Freeborn.payApp.dtos.requests.UserRegistrationRequest;
import com.Freeborn.payApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/registration")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<?>register(@RequestBody UserRegistrationRequest userRegistrationRequest){
        return  new ResponseEntity<>(userService.register(userRegistrationRequest), HttpStatus.OK);
    }
}
