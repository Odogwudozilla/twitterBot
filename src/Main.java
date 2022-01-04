import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Main {

	public static void main(String[] args) {
		newTweet();

	}

	public static void newTweet() {
		Twitter twitter = TwitterFactory.getSingleton();

		String myTweet = "Hello Guys. How are you doing?";
		try {
			twitter.verifyCredentials();
			Status status = twitter.updateStatus(myTweet);
			System.out.println("Success");
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}
}
