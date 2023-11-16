package com.redesip.leer_intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.math.BigDecimal;

public class Transaction extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leer);

        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String transactionType = intent.getStringExtra("TransactionType");
        BigDecimal amount = BigDecimal.valueOf(12.33);
        Log.d("test", transactionType);
        switch (transactionType == null ? "" : transactionType)
        {
            case "SALE":
            {
                textView.setText(transactionType);
                textView.append("otro" + "\n");
                textView.append("otro2"+ "\n");
                textView.append(amount + "\n");
                break;
            }

            case "NEGATIVE_SALE":
                textView.setText(transactionType);
                break;

            default:
                textView.setText("default");
                break;
        }
        Log.d("TAG", "entre");
    }
}