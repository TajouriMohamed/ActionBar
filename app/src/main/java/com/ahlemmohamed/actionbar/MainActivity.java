package com.ahlemmohamed.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = findViewById(R.id.message);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_home:
                myText.setText(getString(R.string.home));
                return true;
            case R.id.action_search:
                myText.setText(getString(R.string.search));
                return true;
            case R.id.action_settings:
                myText.setText(getString(R.string.setting));
                return true;
            case R.id.action_ItemA:
                myText.setText(getString(R.string.item_a));
                return true;
            case R.id.action_ItemB:
                myText.setText(getString(R.string.item_b));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
