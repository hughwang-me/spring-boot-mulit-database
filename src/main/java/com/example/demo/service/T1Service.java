package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.entity.User2;
import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper2.UserMapper2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class T1Service {

    private UserMapper userMapper;
    private UserMapper2 userMapper2;

    @Autowired
    public T1Service(UserMapper userMapper, UserMapper2 userMapper2) {
        this.userMapper = userMapper;
        this.userMapper2 = userMapper2;
    }

    public void run(){
        List<User> users = userMapper.find();
        for (User user : users) {
            log.warn("u1:" + user.toString());
        }

    }

    public void run2(){
        List<User2> users = userMapper2.find();
        for (User2 user : users) {
            log.warn("u2:" + user.toString());
        }

    }
}
