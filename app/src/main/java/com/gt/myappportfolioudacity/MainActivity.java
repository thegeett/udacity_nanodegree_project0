package com.gt.myappportfolioudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void spotifyStreamerButtonClick(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT);
        toast.show();
    }


    public void scoresAppButtonClick(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my Scores app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void libraryAppButtonClick(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my Library Streamer app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void buildBiggerButtonClick(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my Build Bigger Streamer app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void xyzReaderButtonClick(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my XYZ Reader Streamer app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void capstoneButtonClick(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT);
        toast.show();
    }
}

