package com.alonefluteincompletemoon.inkcharm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends Activity {
    EditText ET_activity_login_username,ET_activity_login_password;
    Button BT_activity_login_login,BT_activity_login_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ET_activity_login_username = (EditText)findViewById(R.id.ET_activity_login_username);
        ET_activity_login_password = (EditText)findViewById(R.id.ET_activity_login_password);

        BT_activity_login_login = (Button)findViewById(R.id.BT_activity_login_login);
        BT_activity_login_register = (Button)findViewById(R.id.BT_activity_login_register);

        BT_activity_login_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
    }

    private void Login() {
         //获取文本框输入的字符 ps:trim()移除字符串两侧的空白字符或其他预定义字符
         final String login_username = ET_activity_login_username.getText().toString().trim();
         final String login_password = ET_activity_login_password.getText().toString().trim();
         //判断输入是否为空
        if(TextUtils.isEmpty(login_username)){
            Toast.makeText(this, getResources().getString(R.string.Activity_Login_username_cannot_empty),Toast.LENGTH_SHORT).show();
            /*ET_activity_login_username.requestFocus();*/
            return;
        }else if(TextUtils.isEmpty(login_password)){
            Toast.makeText(this, getResources().getString(R.string.Activity_Login_password_cannot_empty),Toast.LENGTH_SHORT).show();
            /*ET_activity_login_username.requestFocus();*/
            return;
        }else if((!TextUtils.isEmpty(login_password))&&(!TextUtils.isEmpty(login_username))){
            Intent intent = new Intent(LoginActivity.this,InkCharmActivity.class);
            startActivity(intent);
        }
    }
}
