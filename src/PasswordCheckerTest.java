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

  @Test
  public void verifyPasswordMediumTest() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);

    String testPassword = "teamworkdrm";
    testPassword = passwordUtils.describePasswordLength(testPassword);

    assertEquals("medium", testPassword);

  }

  //isAlphanumeric
  

  //isBannedPassword
    @Test 
  public void verifyIfBannedPasswordTest(){
    //Arrange 
    PasswordChecker counter = new PasswordChecker(6, 12);
    //Act
    boolean actual = counter.isBannedPassword("123456");
    //Assert
    assertEquals(true, actual);
  }


}
