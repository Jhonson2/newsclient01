package com.itheima.news01;

import android.content.Intent;
import android.os.SystemClock;

/**
 * Created by yls on 2017/6/26.
 */

public  class StartActivity extends BaseActivity {

    @Override
    public int getLayoutRes() {
        return R.layout.activity_start;
    }

    @Override
    public void initData() {
        new Thread(){
            @Override
            public void run() {
                SystemClock.sleep(1500);
                enterGuideActivity();
            }
        }.start();

    }
/**进入引导页面
 */
    private void enterGuideActivity() {
        Intent intent=new Intent(this,GuideActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initView() {

    }


}