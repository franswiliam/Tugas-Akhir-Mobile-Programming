package com.pahlawan.biographypahlawanindonesia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CutnyakdhienActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cutnyakdhien);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cutnyakdhien, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
    public void openCutnyak(View v){
		Intent i = new Intent(getApplicationContext(),CutnyakActivity.class);
		startActivity(i);
	}
    public void openAlbertus(View w){
		Intent j = new Intent(getApplicationContext(),AlbertusActivity.class);
		startActivity(j);
	}
    public void openAntasari(View x){
		Intent k = new Intent(getApplicationContext(),AntasariActivity.class);
		startActivity(k);
	}
    public void openOerip(View v){
  		Intent i = new Intent(getApplicationContext(),OeripActivity.class);
  		startActivity(i);
  	}
      public void openPakubuwono(View w){
  		Intent j = new Intent(getApplicationContext(),PakubowonoActivity.class);
  		startActivity(j);
  	}
      public void openSisingamangaraja(View x){
  		Intent k = new Intent(getApplicationContext(),SisingamangarajaActivity.class);
  		startActivity(k);
  	}
      public void openHamengkubuwono(View w){
    		Intent j = new Intent(getApplicationContext(),HamengkubuwonoActivity.class);
    		startActivity(j);
    	}
        public void openSudirman(View x){
    		Intent k = new Intent(getApplicationContext(),SudirmanActivity.class);
    		startActivity(k);
    	}
}
