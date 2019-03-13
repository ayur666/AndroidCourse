package com.example.tap.tema1final;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class A2 extends AppCompatActivity implements
        A2F1.OnFragmentInteractionListener, A2F2.OnFragmentInteractionListener, A2F3.OnFragmentInteractionListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Fragment nextFrag= new A2F1();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame, nextFrag, "findThisFragment1")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
