import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }

  @Test
  public void testAlphanumericEverywhere() {
    PasswordChecker checker = new PasswordChecker(0, 0);
    boolean actual = checker.isAlphanumeric("\\\\\\\\");
    assertFalse(actual);
  }

  @Test
  public void testAlphanumericEverywhere2(){
    PasswordChecker checker = new PasswordChecker(0, 0);
    boolean actual = checker.isAlphanumeric("works#");
    assertEquals(false, actual);
  }
  

}
