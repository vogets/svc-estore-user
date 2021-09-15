package com.estore.svcestoreuser.service.impl;

import com.estore.svcestoreuser.dto.UserResponseDto;
import com.estore.svcestoreuser.entities.User;
import com.estore.svcestoreuser.repositories.UserRepository;
import com.estore.svcestoreuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<UserResponseDto> response=new ArrayList<>();
    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserResponseDto> getAllUsers() {
        List<User> allUsers= (List<User>) userRepository.findAll();
        UserResponseDto userResponseDto=new UserResponseDto();
        for(User user:allUsers)
        {
            userResponseDto.setEmail(user.getEmail());
            userResponseDto.setEnabled(user.getEnabled());
            userResponseDto.setFirstName(user.getFirstName());
            userResponseDto.setLastName(user.getLastName());
            userResponseDto.setPhotos(user.getPhotos());
            response.add(userResponseDto);
        }
        return response;
    }
}
