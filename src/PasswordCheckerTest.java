import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  // @Test
  // public void testDummy() {
  //   // This test is used only to validate that your VS Code setup is working
  //   // Delete this test after you have written your other tests
  //   assertEquals(0, 0);
  // }
  //constructor 1: Test to see if password passes with spaces  | should not
@Test 
public void testPasswordWithSpaces() {
  //arrange
    PasswordChecker checker = new PasswordChecker(8, 12);
    String password = "pass word";
  //act
    boolean result = checker.isAlphanumeric(password);
  //assert
    assertEquals(false, result);

}
}
