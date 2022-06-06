package unittesting123;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({countA.class, squareTest.class, even.class})
public class AllTests {

}
