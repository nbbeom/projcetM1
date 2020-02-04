package com.example.projcetm1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnRevoke, btnLogout;
    private FirebaseAuth mAuth ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //btnLogout = (Button)findViewById(R.id.logoutbutton);
        Button button1 = (Button)findViewById(R.id.button1);
        mAuth = FirebaseAuth.getInstance();

        btnLogout.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    private void signOut() {
        FirebaseAuth.getInstance().signOut();
    }

    private void revokeAccess() {
        mAuth.getCurrentUser().delete();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
           // case R.id.logoutbutton:
             //   signOut();
               // finishAffinity();
                //break;
            case R.id.button1:
                Intent intent = new Intent(getApplicationContext(),recommand1.class);
                startActivity(intent);

        }
    }
}