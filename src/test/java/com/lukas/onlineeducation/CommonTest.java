package com.lukas.onlineeducation;

import com.lukas.onlineeducation.domain.User;
import com.lukas.onlineeducation.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;

public class CommonTest {

    @Test
    public void testGeneJwt(){

        User user = new User();
        user.setId(10);
        user.setName("lukas");
        user.setHeadImg("www.chaseingdream.com");

        String token = JwtUtils.geneJsonWebToken(user);
        System.out.println(token);
    }


    @Test
    public void testCheck(){
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJvbmxpbmVfZWR1IiwiaWQiOjEwLCJuYW1lIjoibHVrYXMiLCJpbWciOiJ3d3cuY2hhc2VpbmdkcmVhbS5jb20iLCJpYXQiOjE1OTAwNDc3MzQsImV4cCI6MTU5MDY1MjUzNH0.abm-dE0lbrLigNhXTN5X4gZDIkMqpk-qatpUOx5PRkg";
        Claims claims = JwtUtils.checkJwt(token);
        if (claims != null) {
            int id = (Integer) claims.get("id");
            String name = (String) claims.get("name");
            String img = (String) claims.get("img");
            System.out.println(id);
            System.out.println(name);
            System.out.println(img);
        }
    }
}
