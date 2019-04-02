package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity implements View.OnClickListener{

  EditText edit1,edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

       edit1=(EditText)findViewById(R.id.editText1);
       edit2=(EditText)findViewById(R.id.editText2);
        Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);
        edit1.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
    }
    @Override
    public void onClick(View v){
        String str=edit1.getText().toString();
      Double result=Double.parseDouble(str);
       result=result*33.8;
       String  result1=String.valueOf(result);
        edit2.setText("结果为"+result1);
    }
}
