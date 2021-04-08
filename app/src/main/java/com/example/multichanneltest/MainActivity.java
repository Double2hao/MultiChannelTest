package com.example.multichanneltest;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //根据不同的渠道参数来作不同的逻辑
    if (TextUtils.equals(BuildConfig.TEST_CHANNEL, "one")) {

    } else if (TextUtils.equals(BuildConfig.TEST_CHANNEL, "two")) {

    } else if (TextUtils.equals(BuildConfig.TEST_CHANNEL, "three")) {

    }
  }
}