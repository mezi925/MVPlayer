package com.example.mezi925.mvplayer.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by mezi925 on 2017/2/4.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        ButterKnife.bind(this);
        init();
    }

    /**
     * 子类如果要做初始化，可以复写该方法
     * 做activity通用初始化
     */
    public void init() {

    }

    /**
     * 子类必须实现该方法，返回一个布局的资源id
     * @return
     */
    public abstract int getLayoutResId();
}
