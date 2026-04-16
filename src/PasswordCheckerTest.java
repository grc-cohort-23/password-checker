import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
  
  @Test 
  public void checksIfPasswordLengthReturnsCorrect(){
    PasswordChecker plength= new PasswordChecker(6, 12);

    String actualEmpty=plength.describePasswordLength("");
    String actualMed= plength.describePasswordLength("aaronB");
    String actualLong= plength.describePasswordLength("ThisIsALongPassword");
    String actualShort = plength.describePasswordLength("short");

    assertEquals("Empty Password", actualEmpty);
    assertEquals("short", actualShort);
    assertEquals("medium", actualMed);
    assertEquals("long", actualLong);
  }

  @Test
  public void testIsAlphanumericForLetters() {
    PasswordChecker testCheck = new PasswordChecker(6, 12);

    boolean letters = testCheck.isAlphanumeric("heofuoiwhjslh");
    boolean letter = testCheck.isAlphanumeric("a");

    assertEquals(true, letters);
    assertEquals(true, letter);
  }

  @Test
  public void testIsAlphanumericForNumbers() {
    PasswordChecker testCheck = new PasswordChecker(6, 12);

    boolean numbers = testCheck.isAlphanumeric("273426957");
    boolean number = testCheck.isAlphanumeric("5");

    assertEquals(true, numbers);
    assertEquals(true, number);
  }

  @Test
  public void testIsAlphaNumericForSpecialChars() {
    PasswordChecker testCheck = new PasswordChecker(6, 12);

    boolean specials = testCheck.isAlphanumeric("@!#%^&$*^#(@&)");
    boolean special = testCheck.isAlphanumeric("*");
    boolean space = testCheck.isAlphanumeric(" ");
    boolean spaceLetters = testCheck.isAlphanumeric("s y");

    assertEquals(false, specials);
    assertEquals(false, special);
    assertEquals(false, space);
    assertEquals(false, spaceLetters);
  }

  @Test
  public void testIsBannedPassword() {
    PasswordChecker testCheck = new PasswordChecker(6, 12);

    boolean password = testCheck.isBannedPassword("password");
    boolean nums = testCheck.isBannedPassword("123456");
    boolean qwerty = testCheck.isBannedPassword("qwerty");
    boolean qwerty2 = testCheck.isBannedPassword("QWERTY");
    
    boolean passwordNot = testCheck.isBannedPassword("123password123");
    boolean numsNot = testCheck.isBannedPassword("1234567");

    assertEquals(true, password);
    assertEquals(true, nums);
    assertEquals(true, qwerty);
    assertEquals(true, qwerty2);

    assertEquals(false, passwordNot);
    assertEquals(false, numsNot);

  }

} 
