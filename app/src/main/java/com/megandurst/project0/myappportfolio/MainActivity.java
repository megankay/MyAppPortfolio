package com.megandurst.project0.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends Activity implements OnClickListener {

    //define variables for widgets
    private TextView title;
    private Button spotifyStreamer;
    private Button scoresApp;
    private Button libraryApp;
    private Button buildItBigger;
    private Button xYZReader;
    private Button capstone;
    private String appName = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get references to the widgets
        title = (TextView) findViewById(R.id.title);
        spotifyStreamer = (Button) findViewById(R.id.spotify_streamer);
        scoresApp = (Button) findViewById(R.id.scores_app);
        libraryApp = (Button) findViewById(R.id.library_app);
        buildItBigger = (Button) findViewById(R.id.build_it_bigger);
        xYZReader = (Button) findViewById(R.id.xyz_reader);
        capstone = (Button) findViewById(R.id.capstone);

        //set the listeners
        spotifyStreamer.setOnClickListener(this);
        scoresApp.setOnClickListener(this);
        libraryApp.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        xYZReader.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotify_streamer:
                appName = "Spotify Streamer";
                break;
            case R.id.scores_app:
                appName = "Scores App";
                break;
            case R.id.library_app:
                appName = "Library App";
                break;
            case R.id.build_it_bigger:
                appName = "Build It Bigger App";
                break;
            case R.id.xyz_reader:
                appName = "XYZ Reader App";
                break;
            case R.id.capstone:
                appName = "Capstone App";
                break;
        }

        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + appName + "!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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
