package com.example.admin.myapplication;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextAsterisk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String a = "Branch one";
        mTextAsterisk = findViewById(R.id.text_asterisk);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            mTextAsterisk.setText(Html.fromHtml("U+2217",
                    Html.FROM_HTML_MODE_COMPACT));
        } else {
            mTextAsterisk.setText(Html.fromHtml("U+2217"));
        }
    }
}
