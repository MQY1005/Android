package com.example.myapplication.dao.Impl;

import com.example.myapplication.dao.UserInfoDao;
import com.example.myapplication.entity.UserInfo;

import org.litepal.LitePal;

import java.util.List;


public class UserInfoDaoLiteImpl implements UserInfoDao {
    @Override
    public List<UserInfo> select() {
        return LitePal.findAll(UserInfo.class);
    }

    @Override
    public UserInfo select(String username) {
        List<UserInfo> userInfos = LitePal.where("username=?", username)
                .find(UserInfo.class);
        return userInfos.isEmpty() ? null : userInfos.get(0);
    }

    @Override
    public void insert(UserInfo userInfo) {
        userInfo.save();
    }

    @Override
    public void update(UserInfo userInfo) {
        userInfo.save();
    }

    @Override
    public void delete(UserInfo userInfo) {
        LitePal.delete(UserInfo.class, userInfo.get_id());
    }
}
