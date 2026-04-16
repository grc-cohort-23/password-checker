import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

 
  //constructor 1: Test to see if password passes with spaces  | should not
@Test 
public void testPasswordWithSpacesInBetween() {
  //arrange
    PasswordChecker checker = new PasswordChecker(8, 12);
    String password = "pass word";
  //act
    boolean result = checker.isAlphanumeric(password);
  //assert
    assertEquals(false, result);
  
}
@Test
public void testPasswordWithSpacesAtBeginning() {
  //arrange
    PasswordChecker checker = new PasswordChecker(8, 12);
    String password = " pass";
  //act
    boolean result = checker.isAlphanumeric(password);
  //assert
    assertEquals(false, result);
}
@Test
public void testPasswordWithSpacesAtEnd() {
  //arrange
    PasswordChecker checker = new PasswordChecker(8, 12);
    String password = "password ";
  //act
    boolean result = checker.isAlphanumeric(password);
  //assert
    assertEquals(false, result);
}

// constructor 2: Test to see if password is banned | should be
@Test
  public void TestForBannedPassword() {
    // arrange
      PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    // act and assert
      assertEquals(true, passwordUtils.isBannedPassword("password"));
      assertEquals(false, passwordUtils.isBannedPassword("Password"));
    }
}