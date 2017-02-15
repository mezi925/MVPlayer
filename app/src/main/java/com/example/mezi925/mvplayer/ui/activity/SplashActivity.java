package com.example.mezi925.mvplayer.ui.activity;

import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.mezi925.mvplayer.MainActivity;
import com.example.mezi925.mvplayer.R;

import butterknife.BindView;

public class SplashActivity extends BaseActivity {

    @BindView(R.id.splash_image)
    ImageView splashImage;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_splash;
    }

    @Override
    public void init() {
        super.init();
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.splash_anim);

        // 监听动画的执行过程
        anim.setAnimationListener(mAnimationListener);

        // 启动动画
        splashImage.startAnimation(anim);
    }

    Animation.AnimationListener mAnimationListener = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {
        }

        @Override
        public void onAnimationEnd(Animation animation) {
            //  动画结束后就跳转到主页面
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);

            // 设置跳转时的动画效果,淡入淡出
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

            // 关闭Splash界面
            finish();
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }
    };
}
