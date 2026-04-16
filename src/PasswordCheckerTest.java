import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }

  //describePasswordLength tests
  @Test
  public void verifyTooShort() {
  PasswordChecker passwordUtils = new PasswordChecker(6, 12);
  
  String testPassword = "q";
  testPassword = passwordUtils.describePasswordLength(testPassword);

    assertEquals("short", testPassword);
  }

  //isAlphanumeric

  //isBannedPassword

}
