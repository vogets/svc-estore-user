package com.estore.svcestoreuser.controller;

import com.estore.svcestoreuser.dto.UserResponseDto;
import com.estore.svcestoreuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user/v1")
public class UserController {
@Autowired
    UserService userService;
@GetMapping("/getAllUsers")
    public ResponseEntity<List<UserResponseDto>> getAllUsers()
{
return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
}
}
