package com.example.windowmanager;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import cn.twle.android.floatwindow.MsMainService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_on;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
    }

    private void bindViews() {
        btn_on = (Button) findViewById(R.id.windowmanager);
        btn_on.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.windowmanager:
                Intent mIntent = new Intent(MainActivity.this, MsMainService.class);
                mIntent.putExtra(MsMainService.OPERATION, MsMainService.OPERATION_SHOW);
                startService(mIntent);
                Toast.makeText(MainActivity.this, "悬浮框已开启~", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
