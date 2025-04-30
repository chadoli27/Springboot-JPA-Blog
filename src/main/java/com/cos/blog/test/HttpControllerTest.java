package com.cos.blog.test;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {

    private static final String TAG = "HttpControllerTest";

    // localhost:8000/blog/http/lombok
    @GetMapping("/http/lombok")
    public String lombokTest(){
        Member m = Member.builder().username("ssar").password("1234").email("ssar@cos.com").build();
        System.out.println(TAG + "getter: " + m.getUsername());
        m.setUsername("cos");
        System.out.println(TAG + "setter: " + m.getId());
        return "lombok test 완료";
    }

    // http://localhost:8080/http/get
    @GetMapping("/http/get")
    public String getTest(Member m){

        Member m2 = new Member();
        return "get 요청: " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() + ", " + m.getEmail();
    }

    @PostMapping("/http/post")
    public String postTest(@RequestBody Member m){
        return "post 요청: " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() + ", " + m.getEmail();
    }

    @PutMapping("/http/put")
    public String putTest(@RequestBody Member m){
        return "put 요청: " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() + ", " + m.getEmail();
    }

    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete 요청";
    }

}
