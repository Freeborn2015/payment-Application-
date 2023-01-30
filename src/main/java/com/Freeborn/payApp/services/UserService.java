package com.Freeborn.payApp.services;

import com.Freeborn.payApp.dtos.requests.UserRegistrationRequest;

public interface UserService {

    String  register(UserRegistrationRequest userRegistrationRequest);
}
