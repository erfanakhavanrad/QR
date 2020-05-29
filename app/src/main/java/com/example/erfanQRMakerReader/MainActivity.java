package com.example.erfanQRMakerReader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class MainActivity extends AppCompatActivity {

    EditText qrValue;
    Button generateBTN, scanBTN;
    ImageView qrImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qrValue = findViewById(R.id.txtenterV);
        generateBTN = findViewById(R.id.btnGenerate);
        scanBTN = findViewById(R.id.btnScan);
        qrImage = findViewById(R.id.iamgeQR);
        generateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = qrValue.getText().toString();
                if (data.isEmpty()) {
                    qrValue.setError("Value required");
                } else {

                    QRGEncoder qrgEncoder = new QRGEncoder(data, QRGContents.Type.TEXT, 500);
                    Bitmap qrBits = qrgEncoder.getBitmap();
                    qrImage.setImageBitmap(qrBits);
                }
            }
        });
        scanBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scannerPage = new Intent(MainActivity.this, ScannerActivity.class);
                startActivity(scannerPage);
            }
        });
    }
}