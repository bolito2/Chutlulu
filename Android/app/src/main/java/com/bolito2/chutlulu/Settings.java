package com.bolito2.chutlulu;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.w3c.dom.Text;

public class Settings extends AppCompatActivity {

    MediaPlayer frases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        frases = MediaPlayer.create(this, R.raw.frases);
        frases.start();
    }

}
