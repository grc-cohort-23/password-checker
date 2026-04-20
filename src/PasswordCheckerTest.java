import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  //describePasswordLength tests
  @Test
  public void verifyTooShort() {
  PasswordChecker passwordUtils = new PasswordChecker(6, 12);
  
  String testPassword = "q";
  testPassword = passwordUtils.describePasswordLength(testPassword);

    assertEquals("short", testPassword);
  }

  @Test 
  public void verifyTooLong(){
    //Arrange
    //this is a bug , we need to add longThreshold
    PasswordChecker counter = new PasswordChecker(12, 20);
    //Act
    String actual = counter.describePasswordLength("waytoolongpassword");
    //Assert
    assertEquals("long", actual);
  }

  @Test
  public void verifyPasswordMediumTest() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);

    String testPassword = "teamworkdrm";
    testPassword = passwordUtils.describePasswordLength(testPassword);

    assertEquals("medium", testPassword);

  }

  
  //isAlphanumeric
    @Test
  public void verifyNonAlphanumericIsFlase() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);

    String testPassword = "team work drm";
    
    assertFalse(passwordUtils.isAlphanumeric(testPassword));

  }

  @Test 
  public void verifyAlphanumericIsTrue(){
    //Arrange
    PasswordChecker counter = new PasswordChecker(6, 12);
    //Act
    boolean actual = counter.isAlphanumeric("teamworkdrm");
    //Assert
    assertTrue(actual);
  }

  

  //isBannedPassword
  @Test 
  public void verifyIfBannedPasswordTest(){
    //Arrange 
    PasswordChecker counter = new PasswordChecker(6, 12);
    //Act
    boolean actual = counter.isBannedPassword("123456");
    //Assert
     assertTrue(actual);
  }

  @Test
  public void verifyIsBannedWorksCaseSensitive() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);

    String testPassword = "PASSWORD";
    
    assertTrue(passwordUtils.isBannedPassword(testPassword));

  }

  @Test
  public void verifyNonAlphanumericAtEndIsFalse() {
      //Arrange
      PasswordChecker passwordUtils = new PasswordChecker(6, 12);
      //Act
      String testPassword = "teamwork!";
      //Assert
      assertFalse(passwordUtils.isAlphanumeric(testPassword));
}

  @Test
  public void verifyNonBannedPasswordIsFalse() {
    //Arrange
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    //Act
    String testPassword = "correctHorseBattery";
    //Assert
    assertFalse(passwordUtils.isBannedPassword(testPassword));
}

}
