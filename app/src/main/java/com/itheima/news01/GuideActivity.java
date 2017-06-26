package com.itheima.news01;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by yls on 2017/6/26.
 */

public  class GuideActivity extends BaseActivity {
    private Button btnStart;
    private ImageView iv01;

    @Override
    public int getLayoutRes() {
        return R.layout.activity_guide;
    }

    @Override
    public void initData() {


    }
    /**进入主页面
     */
    private void enterMainActivity() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void initListener() {
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterMainActivity();
            }
        });
    }

    @Override
    public void initView() {
        btnStart= (Button) findViewById(R.id.btn_start);
        iv01= (ImageView) findViewById(R.id.iv_01);
    }


}