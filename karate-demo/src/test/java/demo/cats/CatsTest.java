package demo.cats;

import cucumber.api.CucumberOptions;
import demo.BaseTest;

/**
 *
 * @author pthomas3
 */
@CucumberOptions(features = "classpath:demo/cats/cats.feature")
public class CatsTest extends BaseTest {
    
}
