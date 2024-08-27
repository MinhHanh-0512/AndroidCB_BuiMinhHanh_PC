package com.example.pc;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btntt, btnrs;
    EditText txt1, txt2;
    TextView tvKQ;
    int a, b, kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (EditText) findViewById(R.id.editT1);
        txt2 = (EditText) findViewById(R.id.editT2);
        tvKQ = (TextView) findViewById(R.id.txtKQ);
        btntt = (Button) findViewById(R.id.btn_tt);
        btnrs = (Button) findViewById(R.id.btn_rs);
        sum_cal();
        rs_cal();
    }
    public void sum_cal()
    {
        btntt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
               a = Integer.parseInt(txt1.getText().toString()) ;
               b = Integer.parseInt(txt2.getText().toString()) ;
               kq = a + b;
               // Hiển thị tổng
               tvKQ.setText("");
               tvKQ.setText(tvKQ.getText().toString() + kq);
            }
        });
    }
    public void rs_cal()
    {
        btnrs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                txt1.setText("");
                txt2.setText("");
                tvKQ.setText("");
                txt1.setFocusable(true);
            }
        });
    }


}
