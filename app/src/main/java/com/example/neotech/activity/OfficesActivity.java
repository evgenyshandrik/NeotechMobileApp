package com.example.neotech.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;

import com.example.neotech.R;

public class OfficesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offices);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabHost tabHost = findViewById(android.R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("minsk");
        tabSpec.setIndicator("M");
        tabSpec.setContent(R.id.tvTab1);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("riga");
        tabSpec.setIndicator("R");
        tabSpec.setContent(R.id.tvTab2);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tallinn");
        tabSpec.setIndicator("T");
        tabSpec.setContent(R.id.tvTab3);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("st-p");
        tabSpec.setIndicator("P");
        tabSpec.setContent(R.id.tvTab4);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("florida");
        tabSpec.setIndicator("F");
        tabSpec.setContent(R.id.tvTab5);
        tabHost.addTab(tabSpec);

        tabHost.setCurrentTabByTag("minsk");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onButtonClick(View view) {
        TabHost tabHost = findViewById(android.R.id.tabhost);
        switch (tabHost.getCurrentTabTag()) {
            case "minsk": {
                Intent intent = new Intent(this, MinskImagesActivity.class);
                startActivity(intent);
                break;
            }
            case "riga": {
                Intent intent = new Intent(this, RigaImagesActivity.class);
                startActivity(intent);
                break;
            }
            case "tallinn": {
                Intent intent = new Intent(this, TallinnImagesActivity.class);
                startActivity(intent);
                break;
            }
            case "st-p": {
                Intent intent = new Intent(this, PeterburgImagesActivity.class);
                startActivity(intent);
                break;
            }
            case "florida": {
                Intent intent = new Intent(this, FloridaImagesActivity.class);
                startActivity(intent);
                break;
            }
        }
    }

}
