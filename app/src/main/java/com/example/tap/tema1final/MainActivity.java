package com.example.tap.tema1final;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        A1F1.OnFragmentInteractionListener {


    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public native String stringFromJNI();

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
