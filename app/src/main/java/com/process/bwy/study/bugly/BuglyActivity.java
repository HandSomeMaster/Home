package com.process.bwy.study.bugly;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.process.bwy.study.R;
import com.tencent.bugly.crashreport.CrashReport;

public class BuglyActivity extends AppCompatActivity {
    Button bugTest;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bugly);
        bugTest = findViewById(R.id.bug_test);

        bugTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CrashReport.testJavaCrash();
            }
        });

    }
}
