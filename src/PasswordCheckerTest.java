import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }

  @Test 
  void testForShortPasswordLength() {
    PasswordChecker passwordUtils = new PasswordChecker(7, 14);
    String actual = passwordUtils.describePasswordLength("byebye1");
    assertTrue(actual == "short");
  }

  @Test
  void testForMediumPasswordLength() {
    PasswordChecker passwordUtils = new PasswordChecker(7, 14);
    String actual = passwordUtils.describePasswordLength("byebyebyebye1");
    assertTrue(actual == "medium");
  }

  @Test
  void testForLongPasswordLength() {
    PasswordChecker passwordUtils = new PasswordChecker(7, 14);
    String actual = passwordUtils.describePasswordLength("seahawks12$12helloworld");
    assertTrue(actual == "long");
  }

  @Test
  void testForNoPasword() {
    PasswordChecker passwordUtils = new PasswordChecker(7, 14);
    String actual = passwordUtils.describePasswordLength("        ");
    assertTrue(actual == "short");
  }

  @Test
  void testForAlphaNumericPassword() {
    PasswordChecker passwordUtils = new PasswordChecker(7, 14);
    boolean actual = passwordUtils.isAlphanumeric("123567");
    assertTrue(actual == true);
  }

  @Test
  void testForEmptyPassword() {
    PasswordChecker passwordUtils = new PasswordChecker(7, 14);
    boolean actual = passwordUtils.isAlphanumeric(" ");
    assertTrue(actual == false);
  }

  @Test
  void testForNonAlphaNumericCharacter() {
    PasswordChecker passwordUtils = new PasswordChecker(7, 14);
    boolean actual = passwordUtils.isAlphanumeric("byebye@");
    assertTrue(actual == false);
  }

  @Test
  void testForBannedPassword() {
    PasswordChecker passwordUtils = new PasswordChecker(7, 14);
    boolean actual = passwordUtils.isBannedPassword("password123");
    assertTrue(actual == true);
  }

  @Test
  void testForNotBannedPasswords() {
     PasswordChecker passwordUtils = new PasswordChecker(7, 14);
     boolean actual = passwordUtils.isBannedPassword("helloworld");
     assertTrue(actual == false);
  }
}
