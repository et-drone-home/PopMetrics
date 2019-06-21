package twitter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import todo.TodoApplication;
import twitter4j.TwitterException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest(classes = TodoApplication.class)
@RunWith(SpringRunner.class)
public class TwitterHelperIntegrationTest {

    @Autowired
    BeanFactory factory;
    @Value("${twitter.oauth.consumerKey}")
    private String key;
    @Value("${twitter.oauth.consumerSecret}")
    private String secret;
    @Value("${twitter.oauth.accessToken}")
    private String accessToken;
    @Value("${twitter.oauth.accessTokenSecret}")
    private String accessTokenSecret;

    @Test
    public void whenAppContextBuildsEager_thenTwitterPropertiesAreApplied() {
        TwitterConfiguration tweetConf = new TwitterConfiguration(key, secret, accessToken, accessTokenSecret);
        assertNotNull("Expected instantiated TwitterConfiguration", tweetConf.getTwitterInstance());
    }

    @Test
    public void whenConfigurationIsApplied_thenTwitterActualIDIsReturned() throws TwitterException {
        TwitterConfiguration tweetConf = new TwitterConfiguration(key, secret, accessToken, accessTokenSecret);
        assertEquals("Expected Twitter configuration to have bryants name","BryantDeveloper", tweetConf.getScreenName());
    }

}
