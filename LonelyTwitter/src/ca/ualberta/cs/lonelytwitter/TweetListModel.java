package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	private ArrayList<LonelyTweetModel> tweets;
	
	public TweetListModel() {
		super();
		// TODO Auto-generated constructor stub
		tweets = new ArrayList<LonelyTweetModel>();
	}

	public void add(LonelyTweetModel lonelyTweetModel) throws IllegalArgumentException {
		if(hasTweet(lonelyTweetModel)) {
			throw new IllegalArgumentException();
		}
		tweets.add(lonelyTweetModel);
	}
	
	public Integer getCount() {
		return tweets.size();
	}
	
	public LonelyTweetModel getItem(int i) {
		return tweets.get(i-1);
	}
	
	public boolean hasTweet(LonelyTweetModel tweet) {
		for (int i = 0; i < getCount(); i++) {
			if(tweets.get(i).equals(tweet)) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<LonelyTweetModel> getTweets() {
		return tweets;
	}
}
