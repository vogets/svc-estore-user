package com.estore.svcestoreuser.service;

import com.estore.svcestoreuser.dto.UserResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public List<UserResponseDto> getAllUsers();
}
