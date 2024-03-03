package com.tubesync.tubesyncbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SignupResponse {

    String userName;
    String userEmail;
    String password;

}
