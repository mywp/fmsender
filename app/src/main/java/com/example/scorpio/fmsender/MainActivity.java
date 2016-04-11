package com.example.scorpio.fmsender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*发送广播事件*/
    public void click(View view) {
        Intent intent = new Intent();
        //自定义一个广播动作
        intent.setAction("com.example.scorpio.fmsender.jiuming");
        //大吼一声 把消息发出去了。无序广播
        sendBroadcast(intent);
        //发送有序广播
//        sendOrderedBroadcast(intent,receiverPermission);
    }
}
