package com.example.safefood;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3jFactory;
import org.web3j.protocol.infura.InfuraHttpService;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        String contractAddress = "***********";
        String url = "https://rinkeby.infura.io/v3/c18327ec75324ec68d6b1edfd8f26edc";

        /*** HONOR SYSTEM TEST ETHER ACCOUNT (ಠ_ಠ) ***/
        Credentials credentials = Credentials.create("************");

        ContractJava.Product_sol_Product.load(contractAddress, Web3jFactory.build(new InfuraHttpService(url)), credentials, BigInteger.valueOf(20_000_000_000L), BigInteger.valueOf(4300000));
    }
}
