package com.example.hp.toastcustom;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");

    }

    @Override
    protected void onStart() {
        Log.d("lifecycle","onStart invoked");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("lifecycle","onResume invoked");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.d("lifecycle","onStop invoked");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.d("lifecycle","onPause invoked");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.d("lifecycle","onRestart invoked");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("lifecycle","onDestroy invoked");
        super.onDestroy();
    }

    public void Onclick(View v)
    {
        b1=(Button)findViewById(R.id.button);
        Toast.makeText(MainActivity.this, "this is toast msg",Toast.LENGTH_LONG).show();
    }
}
