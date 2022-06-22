package com.zjf.annotationdemo;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.zjf.annotation_api.ButterKnife;
import com.zjf.app_annotation.BindView;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.textview)
  public TextView mTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ButterKnife.bind(this);
    mTextView.setText("自定义编译时注解测试成功");
  }
}