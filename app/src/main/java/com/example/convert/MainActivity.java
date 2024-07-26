package com.example.convert;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {

    EditText et;
    TextView res;
    Button btn;
    Double F, C;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.main_et_input);
        res = findViewById(R.id.main_tv_res);
        btn = findViewById(R.id.main_btn_calc);

        btn.setOnClickListener(
                view -> {
                    if (et.getText().toString().isEmpty()) {
                        Toast.makeText(this, R.string.Empty, Toast.LENGTH_SHORT).show();
                    } else {
                        F = Double.parseDouble(et.getText().toString());
                        C = (F - 32) * 5 / 9;
                        res.setText(String.format("%s °C", (C.toString()+"00000").substring(0, 7)));
                    }
                }
        );


    }
}