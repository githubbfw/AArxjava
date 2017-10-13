package com.example.administrator.aa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TestAndroid6Activity extends AppCompatActivity {

//    private TextView text;
    private EditText edit;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_android6);

       edit = (EditText) findViewById(R.id.edit);
       button = (Button) findViewById(R.id.button);
       String str = getIntent().getStringExtra("test");
       edit.setText(str);

        button.setOnClickListener(new View.OnClickListener() {
                        @Override
                      public void onClick(View arg0) {
                             // TODO Auto-generated method stub
                             //添加给第一个Activity的返回值，并设置resultCode
                               Intent intent = new Intent();
                              intent.putExtra("return", edit.getText().toString());
                               setResult(RESULT_OK, intent);
                               finish();
                          }
                    });





    }



}
