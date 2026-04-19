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
    PasswordChecker passwordChecker = new PasswordChecker(4, 6);
    //Act 
    String actual =  passwordChecker.describePasswordLength("lolzz");
    //Assert
    assertEquals("medium", actual);
    }

    @Test
    public void testPasswordLengthLong() {
      //Arrange
      PasswordChecker passwordChecker = new PasswordChecker(4, 5);
      //Act
      String actual = passwordChecker.describePasswordLength("ThisIsALongPassword");
      //Assert
      assertEquals("long", actual);
    }

    @Test
    public void isAlphanumericBlank(){
      //Arrange
      PasswordChecker passwordChecker = new PasswordChecker(4, 6);
      //Act
      boolean actual = passwordChecker.isAlphanumeric("   ");
      //Assert
      assertEquals(false, actual);
    }

    @Test
    public void isAlphanumericFalse(){
      //Arrange
      PasswordChecker passwordChecker = new PasswordChecker(4,6);
      //Act
      boolean actual = passwordChecker.isAlphanumeric("_________");
      //Assert
      assertEquals(false,actual);
    }
}
