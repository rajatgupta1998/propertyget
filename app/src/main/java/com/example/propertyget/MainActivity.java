package com.example.propertyget;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MainActivity extends AppCompatActivity {
    private String TAG = "props";
    private String getSystemProperty(String propertyName) {
        String propertyValue = null;

        try {
            Process getPropProcess = Runtime.getRuntime().exec("getprop " + propertyName);

            BufferedReader osRes =
                    new BufferedReader(new InputStreamReader(getPropProcess.getInputStream()));

            propertyValue = osRes.readLine();

            osRes.close();
            Log.d(TAG,"=========================="+propertyName + " = " + propertyValue+"===============");

        } catch (Exception e) {
            // Do nothing - can't get property value
        }

        return propertyValue;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSystemProperty("ro.product.device");
    }
}