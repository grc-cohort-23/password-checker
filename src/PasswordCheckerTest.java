import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  // Testing describePasswordLength
  @Test
  public void testDescribePasswordLengthEmptyString() {
    PasswordChecker checker = new PasswordChecker(6, 12);
    String actual = checker.describePasswordLength("");
    assertEquals("short", actual);
  }

  @Test
  public void testDescribePasswordMediumLength(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    String actual  = checker.describePasswordLength("helloo");
    assertEquals("medium", actual);
  }

  @Test
  public void testDescribePasswordLongLength(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    String actual  = checker.describePasswordLength("iamironman!1");
    assertEquals("long", actual);
  }

  // Testing isAlphaNumeric
  @Test
  public void testIsAlphanumericFalseWithExclamationMark(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    Boolean actual = checker.isAlphanumeric("hello!!");
    assertFalse(actual);
  }

  @Test
  public void testIsAlphanumericAccentedLetter(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    boolean actual = checker.isAlphanumeric("Pokémon");
    assertTrue(actual);
  }

  @Test 
  public void testIsAlphanumericOnlyNumbers(){
      PasswordChecker checker = new PasswordChecker(6, 12);
      Boolean actual = checker.isAlphanumeric("1234567");
      assertTrue(actual);


  }
  
  // Testing isBannedPassword

  @Test
  public void testIsBannedPasswordTwoCombined(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    Boolean actual = checker.isBannedPassword("password123456");
    assertFalse(actual);
  }

  @Test
  public void testIsBannedPasswordAllCaps(){
    PasswordChecker checker = new PasswordChecker(6, 12);
    Boolean actual = checker.isBannedPassword("PASSWORD");
    assertTrue(actual);
  }
  @Test
    public void testIsBannedPasswordCustom(){
      Set<String> custom = new HashSet<>();
      custom.add("jessh123");
      PasswordChecker checker = new PasswordChecker(6, 12, custom);
      assertTrue(checker.isBannedPassword("jessh123"));
  }
}
