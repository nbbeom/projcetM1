package com.example.projcetm1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.naver.maps.map.NaverMapSdk;


public class recommand2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommand2);

        NaverMapSdk.getInstance(this).setClient(new NaverMapSdk.NaverCloudPlatformClient("xvqxoq1ycp"));
    }
}
