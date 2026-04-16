import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
  
  @Test 
  public void checksIfPasswordLengthReturnsCorrect(){
    PasswordChecker plength= new PasswordChecker(6, 12);

    String actualMed= plength.describePasswordLength("aaronB");
    String actualLong= plength.describePasswordLength("ThisIsALongPassword");
    String actualShort = plength.describePasswordLength("short");

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

    assertEquals(false, specials);
    assertEquals(false, special);
    assertEquals(false, space);
  }
} 
