package com.microfeed.backend.service;

import com.microfeed.backend.domain.User;
import com.microfeed.backend.dto.CreateUserRequest;
import com.microfeed.backend.dto.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse getSampleUser() {
        User user = new User(1L, "microfeed_user", "user@microfeed.dev");
        return new UserResponse(user.getId(), user.getUsername());
    }
    public UserResponse createUser(CreateUserRequest request){
        User user = new User(
                2L,
                request.getUsername(),
                request.getEmail()
        );
        return new UserResponse(user.getId(), user.getUsername());
    }
}