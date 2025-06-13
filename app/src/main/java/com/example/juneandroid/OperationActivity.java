package com.example.juneandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OperationActivity extends AppCompatActivity {
    EditText edtno1,edtno2;
    Button btnadd;
    TextView tvresult;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_operation);
        edtno1=findViewById(R.id.edtno1);
        edtno2=findViewById(R.id.edtno2);
        btnadd=findViewById(R.id.btnadd);
        tvresult=findViewById(R.id.tvresult);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1=Integer.parseInt(edtno1.getText().toString());
                int no2=Integer.parseInt(edtno2.getText().toString());
                int result=add(no1,no2);
                tvresult.setText(String.valueOf(result));
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private int add(int no1, int no2) {
        return no1+no2;
    }
}