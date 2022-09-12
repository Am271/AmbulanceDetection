package com.ambulancedetection.map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.mapmyindia.sdk.maps.MapmyIndia;
import com.mmi.services.account.MapmyIndiaAccountManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapmyIndiaAccountManager.getInstance().setRestAPIKey(getString(R.string.api_key));
        MapmyIndiaAccountManager.getInstance().setMapSDKKey(getString(R.string.api_key));
        MapmyIndia.getInstance(getApplicationContext());

        startActivity(new Intent(this, MapActivity.class));
    }
}