package com.microfeed.backend.service;

import com.microfeed.backend.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getSampleUser() {
        return new User(1L, "microfeed_user", "user@microfeed.dev");
    }
}
