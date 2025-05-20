package com.cos.blog.test;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    private int id;
    private String username;
    private String password;
    private String email;



}
