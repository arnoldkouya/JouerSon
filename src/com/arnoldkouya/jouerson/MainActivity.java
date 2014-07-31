/* Copyright (c) 2014 Arnold KOUYA*/
package com.arnoldkouya.jouerson;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	//Déclaration des variables sui recuperont les XML
    Button btn_jouer;
    MediaPlayer mediaplayer;
  
    
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	//Récuperation valeur xml
		btn_jouer=(Button)findViewById(R.id.btn_jouer);
		
		
	// Evenement sur le bouton
		btn_jouer.setOnClickListener(this);
			
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	// Methode sur le click d'un bouton 
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mediaplayer=MediaPlayer.create(this, R.raw.abidjanaise);
		switch (v.getId()) {
		case R.id.btn_jouer:
			mediaplayer.start();
			break;
       
		default:
			break;
		}
		
	}

}
