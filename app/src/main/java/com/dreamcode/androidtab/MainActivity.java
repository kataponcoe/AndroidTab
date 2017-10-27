package com.dreamcode.androidtab;

import com.dreamcode.androidtab.R;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TabHost tabHost = getTabHost();
        
        // Tab untuk tentang aplikasi
        TabSpec tentangspec = tabHost.newTabSpec("Tidak Tersedia");
        tentangspec.setIndicator("Tidak Tersedia");
        Intent tentangIntent = new Intent(this, TentangAplikasi.class);
        tentangspec.setContent(tentangIntent);
        
        // Tab untuk tentang dreamcode developer
        TabSpec dreamcodespec = tabHost.newTabSpec("Dreamcode Developer");
        // setting Title and Icon for the Tab
        dreamcodespec.setIndicator("Dreamcode Developer");
        Intent dreamcodeIntent = new Intent(this, DreamcodeAbout.class);
        dreamcodespec.setContent(dreamcodeIntent);
        
        // Adding all TabSpec to TabHost
        tabHost.addTab(tentangspec); // buat nambahin tab tentang aplikasi
        tabHost.addTab(dreamcodespec); // buat nambahin tab dreamcode developer
    }
}