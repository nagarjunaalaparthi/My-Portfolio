package com.myportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void createToast(View v) {
        switch (v.getId()) {
            case R.id.open_popular_movies:
                showMessage(getString(R.string.popular_movies));
                break;
            case R.id.open_stock_hawk:
                showMessage(getString(R.string.stock_hawk));
                break;
            case R.id.open_build_it_bigger:
                showMessage(getString(R.string.build_it_bigger));
                break;
            case R.id.open_metarial_app:
                showMessage(getString(R.string.my_metarial_app));
                break;
            case R.id.open_wearable_app:
                showMessage(getString(R.string.my_wearable_project));
                break;
            case R.id.open_capstone_project:
                showMessage(getString(R.string.capstone));
                break;
        }
    }

    public void showMessage(String message) {
        Toast.makeText(MainActivity.this, "This will launch my '" + message + "' app!", Toast.LENGTH_LONG).show();
    }

}
