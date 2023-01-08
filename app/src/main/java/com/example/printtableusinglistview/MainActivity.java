package com.example.printtableusinglistview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 EditText editNum,editLength;
 ListView listView;
    String str1,str2;
    Button btn;
    ArrayList arrayList=new ArrayList();
    int Number,Length;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNum=findViewById(R.id.etNum);
        editLength=findViewById(R.id.etLength);
        listView=findViewById(R.id.ListView);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1=editNum.getText().toString();
                int Number= Integer.parseInt(str1);

                str2=editLength.getText().toString();
                int Length= Integer.parseInt(str2);



                for (int i=1;i<=Length;i++){
                    arrayList.add(Number+ "*" +i+ "=" +i*Number);

                }
                ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1 ,arrayList);
                listView.setAdapter(adapter);
            }
        });










    }
}