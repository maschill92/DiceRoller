package io.github.maschill92.diceroller;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.TextView;
public class MainActivity extends Activity implements OnItemSelectedListener {

	private Integer diceRollCount = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Spinner spinner = (Spinner) findViewById(R.id.spinner_rollCount);
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void rollD4(View view) {
    	Random rand = new Random();
    	int total = 0;
    	for (int i = 0; i < diceRollCount; i++) {
    		total += rand.nextInt(4) + 1;
    	}
    	TextView text = (TextView) findViewById(R.id.textView_displayText);
    	text.setText(Integer.toString(total));
    }
    
    public void rollD6(View view) {
    	Random rand = new Random();
    	int total = 0;
    	for (int i = 0; i < diceRollCount; i++) {
    		total += rand.nextInt(6) + 1;
    	}
    	TextView text = (TextView) findViewById(R.id.textView_displayText);
    	text.setText(Integer.toString(total));
    }
    
    public void rollD8(View view) {
    	Random rand = new Random();
    	int total = 0;
    	for (int i = 0; i < diceRollCount; i++) {
    		total += rand.nextInt(8) + 1;
    	}
    	TextView text = (TextView) findViewById(R.id.textView_displayText);
    	text.setText(Integer.toString(total));
    }
    
    public void rollD10(View view) {
    	Random rand = new Random();
    	int total = 0;
    	for (int i = 0; i < diceRollCount; i++) {
    		total += rand.nextInt(10) + 1;
    	}
    	TextView text = (TextView) findViewById(R.id.textView_displayText);
    	text.setText(Integer.toString(total));
    }
    
    public void rollD12(View view) {
    	Random rand = new Random();
    	int total = 0;
    	for (int i = 0; i < diceRollCount; i++) {
    		total += rand.nextInt(12) + 1;
    	}
    	TextView text = (TextView) findViewById(R.id.textView_displayText);
    	text.setText(Integer.toString(total));
    }
    
    public void rollD20(View view) {
    	Random rand = new Random();
    	int total = rand.nextInt(20) + 1;
    	TextView text = (TextView) findViewById(R.id.textView_displayText);
    	text.setText(Integer.toString(total));
    }
    
    public void rollD100(View view) {
    	Random rand = new Random();
    	int total = rand.nextInt(100) + 1;
    	TextView text = (TextView) findViewById(R.id.textView_displayText);
    	text.setText(Integer.toString(total));
    }


	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int pos,
			long id) {
		diceRollCount = Integer.parseInt(parent.getItemAtPosition(pos).toString());
		
	}


	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
    
}
