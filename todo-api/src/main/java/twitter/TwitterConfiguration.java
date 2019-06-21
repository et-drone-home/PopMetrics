package twitter;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterConfiguration {

    private String key;
    private String secret;
    private String accessToken;
    private String accessTokenSecret;

    public TwitterConfiguration(String key, String secret, String accessToken, String accessTokenSecret) {
        this.key = key;
        this.secret = secret;
        this.accessToken = accessToken;
        this.accessTokenSecret = accessTokenSecret;
    }

    public Twitter getTwitterInstance() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(key)
                .setOAuthConsumerSecret(secret)
                .setOAuthAccessToken(accessToken)
                .setOAuthAccessTokenSecret(accessTokenSecret);
        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf.getInstance();

    }

    public Object getScreenName() throws TwitterException {
        return getTwitterInstance().getScreenName();
    }
}
