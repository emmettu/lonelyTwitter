package ca.ualberta.cs.lonelytwitter.test;
import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;


public class LonelyTwitterIntentTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public LonelyTwitterIntentTest() {
		super(IntentReaderActivity.class);
	}
	//Make sure activity received the text
	public void testSendText() {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, "some string");
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.NORMAL);
		setActivityIntent(intent);
		//kind of like a new for an activity
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		assertEquals("some string", activity.getText());
	}
	public void  testDoubleText() {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, "some string");
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.DOUBLE);
		setActivityIntent(intent);
		//kind of like a new for an activity
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		assertEquals("some stringsome string", activity.getText());
	}
	
	public void testDisplayText() {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, "some string");
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.NORMAL);
		setActivityIntent(intent);
		//kind of like a new for an activity
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		assertEquals("some string", activity.getView().getText());
	}
//	public void testDisplayText2() {
//		//kind of like a new for an activity
//		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
//		try {
//			runTestOnUiThread(new Runnable() {
//				
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					getActivity().getView().setText("some string");
//				}
//			});
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		assertEquals("some string", activity.getView().getText());
//	}
	public void testReverseText() {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, "some string");
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.REVERSE);
		setActivityIntent(intent);
		//kind of like a new for an activity
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		assertEquals("gnirts emos", activity.getText());
	}
	public void testDefaultMessage() {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, "");
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.NORMAL);
		setActivityIntent(intent);
		//kind of like a new for an activity
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		assertTrue("text was: " +"|"+ activity.getText()+"|", activity.getText() == "No message");
		assertEquals("No message", activity.getText());
	}
	public void testOnScreen() {
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		View origin = activity.getWindow().getDecorView();
		ViewAsserts.assertOnScreen(origin, activity.getView());
	}
}
