package com.example.loginapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    // 用户名
    EditText userNameText;
    // 密码
    EditText passwordText;
    // 登录按钮
    Button loginBtn;
    // 提示
    TextView tipsTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        // 初始化
        userNameText = (EditText) findViewById(R.id.userNameText);
        passwordText = (EditText) findViewById(R.id.passwordText);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        tipsTextView = (TextView) findViewById(R.id.tipsTextView);
        // 登录业务逻辑
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 用户名获取
                String userName = userNameText.getText().toString();
                // 密码获取
                String password = passwordText.getText().toString();
                // 判断
                if (userName.equals("") || password.equals("")) {
                    // 用户名或密码不能为空
                    tipsTextView.setText("用户名或密码不能为空！");
                    tipsTextView.setVisibility(View.VISIBLE);
                }else if (!userName.equals("yanyixuan") || !password.equals("202112170")) {
                    // 用户名或密码错误
                    tipsTextView.setText("用户名或密码错误！");
                    tipsTextView.setVisibility(View.VISIBLE);
                } else {
                    // 登录成功
                    tipsTextView.setText("登录成功！");
                    tipsTextView.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
