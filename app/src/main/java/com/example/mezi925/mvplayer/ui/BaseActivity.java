package com.example.mezi925.mvplayer.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by mezi925 on 2017/2/4.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayoutResId());
        ButterKnife.bind(this);
        init();
    }

    /**
     * 子类如果要做初始化，可以复写该方法
     * 做activity通用初始化
     */
    private void init() {

    }

    /**
     * 子类必须实现该方法，返回一个布局的资源id
     * @return
     */
    public abstract int getLayoutResId();
}
