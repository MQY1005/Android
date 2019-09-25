package com.example.myapplication.activity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.entity.UserInfo;
import com.example.myapplication.service.Impl.UserInfoServiceImpl;
import com.example.myapplication.service.UserInfoService;
import com.example.myapplication.utils.SharedUtils;
import com.example.myapplication.utils.StatusUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class UserInfoActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvNickname,tvSiginature,tvUsername,tvsex;
    private RelativeLayout nicknameLayout,signatureLayout,sexLayout;

    private String spUsername;
    private UserInfo userInfo;
    private UserInfoService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

       // StatusUtils.initToolbar(this,"个人信",true,LoginActivity.class);
        initData();
        initView();

    }

    private void initView() {
        tvUsername=findViewById(R.id.tv_username);
//        tvNickname=findViewById(R.id.setting_nickname);
//        tvsex=findViewById(R.id.setting_sex);
//        tvSiginature=findViewById(R.id.setting_siginature);

//        nicknameLayout=findViewById(R.id.rl_nickname);
//        sexLayout=findViewById(R.id.rl_sex);
//        signatureLayout=findViewById(rl_signature);

        tvUsername.setText(userInfo.getUsername());
        tvNickname.setText(userInfo.getNickname());
        tvsex.setText(userInfo.getSex());
        tvSiginature.setText(userInfo.getSignature());
        signatureLayout.setOnClickListener(this);

    }

    private void initData() {
        spUsername= SharedUtils.readValue(this,"loginUser");
        service=new UserInfoServiceImpl(this);
        userInfo=service.get(spUsername);
        if(userInfo==null){
            userInfo=new UserInfo();
            userInfo.setUsername(spUsername);
            userInfo.setNickname("课程助手");
            userInfo.setSignature("课程助手");
            userInfo.setSex("男");
            service.save(userInfo);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.rl_nickname;
//            modifyNickname();
//            break;
//            case R.id.rl_sex;
//            modifySex();
//            break;
//            case R.id.rl_signature;
//            modifySignature();
//            break;
        }
    }

    private void modifyNickname(){
        String nickname=tvNickname.getText().toString();
        Intent intent=new Intent(UserInfoActivity.this,LoginActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("title","设置昵称");
        bundle.putString("value",nickname);
        bundle.putInt("flag",1);
        intent.putExtras(bundle);
        startActivityForResult(intent,1);
    }
    private void modifySignature(){
        String signature=tvSiginature.getText().toString();
        Intent intent=new Intent(UserInfoActivity.this,LoginActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("title","设置签名");
        bundle.putString("value",signature);
        bundle.putInt("flag",2);
        intent.putExtras(bundle);
        startActivityForResult(intent, Integer.parseInt(MIDI_SERVICE));
    }
    private void modifySex(){
        final String[] datas={"男","女"};
        String sex=tvsex.getText().toString();
        final List<String> sexs= Arrays.asList(datas);
        int selected =sexs.indexOf(sex);
        new AlertDialog.Builder(this).setTitle("性别").setSingleChoiceItems(datas, selected, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String sex=datas[which];
                tvsex.setText(sex);
                userInfo.setSex(sex);
                service.modify(userInfo);

                dialog.dismiss();

            }
        }).show();

    }
}
