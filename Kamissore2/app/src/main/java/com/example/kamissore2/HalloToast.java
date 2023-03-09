package com.example.kamissore2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HalloToast extends AppCompatActivity {
    TextView textView;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hallo_toast);

        textView = findViewById(R.id.counterview);
    }

    public void TampilPesan(View view) {
        Toast myToast = Toast.makeText(HalloToast.this,"Saya adalah toast",1);
        myToast.show();
    }

    public void Hitung(View view) {
        counter++;
        textView.setText(Integer.toString(counter));
    }
}