package com.aaagame.proframework.activity.test;

import android.os.Bundle;
import android.view.View;

import com.aaagame.proframework.R;
import com.aaagame.proframework.activity.BaseFragmentActivity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;

@ContentView(R.layout.t_activity_widget_bottomcircle)
public class T_Widget_BottomCircle_Activity extends BaseFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initListener();
        initData();
        reqData();
    }

    //=============================初始化view
    private void initView() {

    }

    //=============================初始化监听
    private void initListener() {

    }

    @Event(value = {})
    private void setClick(View view) {
        switch (view.getId()) {
            default:
                break;
        }
    }

    //=============================初始化数据和变量
    private void initData() {

    }

    //=============================网络请求数据
    private void reqData() {

    }
    //=============================其他操作
}
