import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testPasswordLengthShort(){
    //Arrange
    PasswordChecker passwordChecker = new PasswordChecker(4,5);

    //Act
    String password = "abc";
    String actual = passwordChecker.describePasswordLength(password);

    //Assert
    assertEquals("short", actual);
}

  @Test 
  public void testPasswordLengthMedium() {
    //Arrange 
    PasswordChecker medium = new PasswordChecker(4, 6);
    //Act 
    String actual =  medium.describePasswordLength("lolzz");
    //Assert
    assertEquals("medium", actual);
    }

    @Test
    public void testPasswordLengthLong() {
      //Arrange
      PasswordChecker longPassword = new PasswordChecker(4, 5);
      //Act
      String actual = longPassword.describePasswordLength("ThisIsALongPassword");
      //Assert
      assertEquals("long", actual);
    }
}
