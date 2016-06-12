package com.lightcone.webviewdemo2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Add Click listeners for all buttons
        View firstButton = findViewById(R.id.button1);
        firstButton.setOnClickListener(this);
        View secondButton = findViewById(R.id.button2);
        secondButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the 
    	// action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    // Process the button click events
	@Override
	public void onClick(View v) {
		switch(v.getId()){
        case R.id.button1:
            Intent j = new Intent(this, Webscreen.class);
            j.putExtra(com.lightcone.webviewdemo2.Webscreen.URL, 
                "http://eagle.phys.utk.edu/guidry/recipes/mojito.html");
            startActivity(j);
        break;
        
        case R.id.button2:
            Intent k = new Intent(this, Webscreen.class);
            k.putExtra(com.lightcone.webviewdemo2.Webscreen.URL, 
                "http://www.ssd.noaa.gov/goes/east/tatl/vis-l.jpg");
            startActivity(k);
        break;      
    }
		
	}
    
}
