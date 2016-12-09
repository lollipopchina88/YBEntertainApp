package com.yb.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Windows 10 on 2016/12/9.
 */

public class BaseActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void showToast(int resId){
        Toast toast = Toast.makeText(this, getText(resId), Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void showToast(String msg){
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void showDialog(String message, boolean canceledOnTouchOutside){

    }


    public void closeDialog (){

    }

}
