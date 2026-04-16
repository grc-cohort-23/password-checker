import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  //describePasswordLength tests
  @Test
  public void verifyTooShort() {
  PasswordChecker passwordUtils = new PasswordChecker(6, 12);
  
  String testPassword = "q";
  testPassword = passwordUtils.describePasswordLength(testPassword);

    assertEquals("short", testPassword);
  }

  @Test
  public void verifyPasswordMediumTest() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);

    String testPassword = "teamworkdrm";
    testPassword = passwordUtils.describePasswordLength(testPassword);

    assertEquals("medium", testPassword);
  }

  //isAlphanumeric

  //isBannedPassword

}
