package com.pouriahemati.customtoastmasseg;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PHCustomToastMasseg.showToastMessage(this,"Hello World" , getDrawable(R.drawable.ic_android_black_24dp) );
    }
}
