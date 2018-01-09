package com.example.student.a20180109;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        menu.add(0,1,0,"ADD");
//        menu.add(0,2,0,"Edit");
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            //case 1:
            case R.id.menu_add:
                Toast.makeText(MainActivity.this,"使用者按下ADD",Toast.LENGTH_SHORT).show();
                break;
            //case 2:
            case R.id.menu_edit:
                Toast.makeText(MainActivity.this,"使用者按下Edit",Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
