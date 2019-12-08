package com.yuntransadmin.project.service.Impl;

import com.yuntransadmin.project.mapper.User_tabMapper;
import com.yuntransadmin.project.model.User_tab;
import com.yuntransadmin.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ligang
 * @create 2019-12-08 9:47
 */
@Service
public class UserServiceImpl  implements UserService {

     @Autowired
     private User_tabMapper user_tabMapper;
    @Override
    public User_tab getDataByUserName(String username) {
        return user_tabMapper.getDataByUserName(username);
    }

    @Override
    public User_tab login(String username) {
        return user_tabMapper.login(username);
    }
}
