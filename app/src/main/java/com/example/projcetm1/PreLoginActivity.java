package com.example.projcetm1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PreLoginActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_NoActionBar);
        setContentView(R.layout.activity_pre_login);
        Button login = (Button)findViewById(R.id.loginButton);
        Button Sign = (Button)findViewById(R.id.SigninButton);
        login.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginButton:
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);

        }


}
}
