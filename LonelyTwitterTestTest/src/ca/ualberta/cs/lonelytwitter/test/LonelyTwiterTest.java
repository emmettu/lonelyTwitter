package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTwiterTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTwiterTest() {
		super(LonelyTwitterActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	public void testAddTweets() {
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel tweet = new LonelyTweetModel("Test");
		tlm.add(tweet);
		assertEquals(tlm.getCount(), new Integer(1));
		
		try {
			tlm.add(tweet);
		} catch (IllegalArgumentException e) {
			assertTrue(tlm.getCount() == 1);
			assertEquals(e.getClass(), IllegalArgumentException.class);
		}
	}
	
	public void testHasTweet() {
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel tweet = new LonelyTweetModel("Test");
		tlm.add(tweet);
		assertTrue(tlm.hasTweet(tweet));
		assertFalse(tlm.hasTweet(new LonelyTweetModel("Not Test")));
	}
	
	public void testGetItem() {
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel firstTweet = new LonelyTweetModel("Test");	
		tlm.add(firstTweet);
		assertSame(firstTweet, tlm.getItem(1));
	}
	
	public void testGetTweets() {
		TweetListModel tlm = new TweetListModel();
		ArrayList<LonelyTweetModel> testArray = new ArrayList<LonelyTweetModel>();
		
		LonelyTweetModel firstTweet = new LonelyTweetModel("Test1");
		LonelyTweetModel secondTweet = new LonelyTweetModel("Test2");
		LonelyTweetModel thirdTweet = new LonelyTweetModel("Test3");
		
		testArray.add(firstTweet);
		tlm.add(firstTweet);
		
		testArray.add(secondTweet);
		tlm.add(secondTweet);
		
		testArray.add(thirdTweet);
		tlm.add(thirdTweet);
		
		assertEquals(tlm.getTweets(), testArray);
	}
}
