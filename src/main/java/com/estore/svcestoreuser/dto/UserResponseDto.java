package com.estore.svcestoreuser.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponseDto {
    private String email;
    private Boolean enabled;
    private String firstName;
    private String lastName;
    private String photos;
}
