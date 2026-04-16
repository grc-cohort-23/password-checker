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
    PasswordChecker checker = new PasswordChecker(6, 12);
    boolean actual = checker.isAlphanumeric("works#");
    assertEquals(false, actual);
  }

  @Test
  public void testAlphanumericEverywhere3(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    boolean actual = checker.isAlphanumeric("    ");
    assertEquals(false, actual);
  }
  

  @Test
  public void testPasswordLengthShort(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    String actual = checker.describePasswordLength("ddddd");
    assertEquals("short", actual);
  }

  @Test
  public void testPasswordLengthMedium(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    String actual = checker.describePasswordLength("ddddddddddd");
    assertEquals("medium", actual);
  }

  @Test
  public void testPasswordLengthLong(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    String actual = checker.describePasswordLength("ddddddddddddddddddddddddddddddddddddddd");
    assertEquals("long", actual);
  }

  @Test
  public void testIsValid1(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    boolean actual = checker.isBannedPassword("Password123");
    assertEquals(true, actual);
  }

  @Test
  public void testIsValid2(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    boolean actual = checker.isBannedPassword("leTmeiN");
    assertEquals(true, actual);
  }

   @Test
  public void testIsValid3(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    boolean actual = checker.isBannedPassword("Valid");
    assertEquals(false, actual);
  }

  

}
