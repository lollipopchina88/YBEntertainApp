package com.yb.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tv_test)
    TextView tvTest;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.tv_test)
    public void sayHelo(TextView tvTest){
        switch (tvTest.getId()){
            case R.id.tv_test:
                tvTest.setText("你按到我了啦4!");
                showToast("你按到我了啦4!");
                break;
        }
    }
}
