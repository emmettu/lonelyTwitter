package ca.ualberta.cs.lonelytwitter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LonelyTwitterActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lonely_twitter_activity2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lonely_twitter_activity2, menu);
		return true;
	}

}
