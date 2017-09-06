package com.example.toon.chanting;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] chantingItems = new String[]{
            "บทสวดมนต์ บูชาพระรัตนตรัย",
            "บทสวดมนต์ อาราธนาศีล 5",
            "บทสวดมนต์ นะโมสรรเสริญพระพุทธเจ้า",
            "บทสวดมนต์ก่อนนอน ไตรสรณคมน์",
            "บทสวดมนต์ สมาทานศีล 5",
            "บทสวดมนต์ อธิษฐานรักษาศีล 5",
            "บทสวดมนต์ก่อนนอน ศีล 5",
            "บทสวดมนต์ แผ่เมตตาแก่ตนเอง",
            "บทสวดมนต์ แผ่เมตตาให้สรรพสัตว์",
            "บทสวดมนต์ก่อนนอน บทแผ่ส่วนกุศล"
    };

    Integer[] chantingImages = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        setTitle("บทสวดมนต์ก่อนนอน");

        final ListView lvMain = (ListView) findViewById(R.id.lvMain);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int itemPosition = i;
                String itemValue;
                itemValue = (String) lvMain.getItemAtPosition(i);

                Intent showPage = new Intent(MainActivity.this, DetailActivity.class);
                showPage.putExtra("ID", String.valueOf(itemPosition));
                showPage.putExtra("TITLE", itemValue);

                startActivity(showPage);
            }
        });

        CustomArrayAdapter customArrayAdapter = new CustomArrayAdapter(MainActivity.this, chantingItems, chantingImages);
        lvMain.setAdapter(customArrayAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
