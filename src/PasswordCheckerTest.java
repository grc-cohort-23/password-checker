import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDescribePasswordLengthEmptyString() {
    String password = "";
    PasswordChecker checker = new PasswordChecker(6, 12);
    String actual = checker.describePasswordLength(password);
    assertEquals("short", actual);
  }

  @Test
  public void testDescribePasswordMediumLength(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    String actual  = checker.describePasswordLength("helloo");
    assertEquals("medium", actual);
  }
  // Testing isAlphaNumeric
  @Test
  public void testIsAlphanumericFalseWithExclamationMark(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    Boolean actual = checker.isAlphanumeric("hello!!");
    assertFalse(actual);
  }
  
}
