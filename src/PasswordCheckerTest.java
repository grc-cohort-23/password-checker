import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  // Test describePasswordLength()
  @Test
  public void describePasswordLength_PasswordIs6Long_LengthMedium() {
    // Arrange 
    PasswordChecker counter = new PasswordChecker(6,12);
    // Act
    String actual = counter.describePasswordLength("123456");
    // Assert
    assertEquals("medium",actual);
  }

  // Test describePasswordLength()
  @Test
  public void describePasswordLength_PasswordIs5Long_LengthShort() {
    // Arrange 
    PasswordChecker counter = new PasswordChecker(6,12);
    // Act
    String actual = counter.describePasswordLength("12345");
    // Assert
    assertEquals("short",actual);
  }

  // Test describePasswordLength()
  @Test
  public void describePasswordLength_PasswordIs12Long_LengthLong() {
    // Arrange 
    PasswordChecker counter = new PasswordChecker(6,12);
    // Act
    String actual = counter.describePasswordLength("123456789abc");
    // Assert
    assertEquals("long",actual);
  }

  @Test
  public void describePasswordLength_PasswordIs13Long() {
    // Arrange 
    PasswordChecker counter = new PasswordChecker(6,12);
    // Act
    String actual = counter.describePasswordLength("1234567890abc");
    // Assert
    assertEquals("long",actual);
  }


  // Test isAlphanumeric()
  @Test
  public void isAlphanumeric_LettersAndNumbers_True() {
    // Arrange 
    PasswordChecker checker = new PasswordChecker(6,12);
    // Act
    boolean actual = checker.isAlphanumeric("1s1t4lph4Num3r1c");
    // Assert
    assertTrue(actual);
  }

  // Test isAlphanumeric()
  @Test
  public void isAlphanumeric_LettersAndNumbers_False() {
    // Arrange 
    PasswordChecker checker = new PasswordChecker(6,12);
    // Act
    boolean actual = checker.isAlphanumeric("ihgsdfyhes@#$");
    // Assert
    assertFalse(actual);
  }

  // Test isAlphanumeric()
  @Test
  public void isAlphanumeric_Numbers_Only() {
    // Arrange 
    PasswordChecker checker = new PasswordChecker(6,12);
    // Act
    boolean actual = checker.isAlphanumeric("123456789");
    // Assert
    assertTrue(actual);
  }

  // Test isBannedPassword()
  @Test
  public void isBannedPassword_Password_True() {
    // Arrange
    PasswordChecker banner = new PasswordChecker(6,12);
    // Act
    boolean actual = banner.isBannedPassword("PaSsWoRd");
    // Assert
    assertTrue(actual);
  }

  // Test isBannedPassword()
@Test
  public void isBannedPassword_Password_False() {
    // Arrange
    PasswordChecker banner = new PasswordChecker(6,12);
    // Act
    boolean actual = banner.isBannedPassword("micCheckOneTwo");
    // Assert
    assertFalse(actual);
  }


}
