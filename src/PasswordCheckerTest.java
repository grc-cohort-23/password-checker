import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDummy() {
  }

@Test
  public void TestForBannedPassword() {
    // arrange
      PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    // act and assert
      assertEquals(true, passwordUtils.isBannedPassword("password"));
      assertEquals(false, passwordUtils.isBannedPassword("Password"));
    }
}
