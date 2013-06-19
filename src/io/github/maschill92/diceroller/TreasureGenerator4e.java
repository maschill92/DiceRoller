package io.github.maschill92.diceroller;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TreasureGenerator4e extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_treasure_generator4e);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.treasure_generator4e, menu);
		return true;
	}

}
