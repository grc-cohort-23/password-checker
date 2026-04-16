import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testPasswordLengthShort(){
    PasswordChecker passwordChecker = new PasswordChecker(4,5);
    String password = "abc";
    String actual = passwordChecker.describePasswordLength(password);
    assertEquals("short", actual);
}
}
