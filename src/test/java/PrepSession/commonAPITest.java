package PrepSession;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class commonAPITest extends commonAPI
{
    @Test
    public void GetTitle(){
        String title = driver.getTitle();
        System.out.println("**********" + title + "**********");
        Assert.assertEquals(title,"Google");
    }
}
