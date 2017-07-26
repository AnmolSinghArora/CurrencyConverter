package com.anmolarora.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency1 (View view){

        EditText currencyExchange = (EditText) findViewById(R.id.currencyExchange);

        Double currencyExchangeDouble = Double.parseDouble(currencyExchange.getText().toString());

        Double INRamount = currencyExchangeDouble * 64.25;

        Toast.makeText(MainActivity.this, "Amount in INR is " + String.format("%.2f",INRamount), Toast.LENGTH_LONG).show();

        Log.i("Test1","Button 1 Clicked");

    }
    public void convertCurrency2 (View view){

        EditText currencyExchange = (EditText) findViewById(R.id.currencyExchange);

        Double currencyExchangeDouble = Double.parseDouble(currencyExchange.getText().toString());

        Double USDamount = currencyExchangeDouble / 64.25;

        Toast.makeText(MainActivity.this, "Amount in USD is " + String.format("%.2f", USDamount), Toast.LENGTH_LONG).show();


        Log.i("Test2","Button 2 Clicked");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
