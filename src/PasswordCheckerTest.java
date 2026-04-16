import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  //Test list 

  //isAlphanumeric() checks if pass word is numbers or digits

    @Test
    void testCheckIfTheAlpahnumericIsValid(){
      //arrange
      PasswordChecker tst = new PasswordChecker(8, 16);
      //act
      boolean actual = tst.isAlphanumeric("helloHosea");
      //assert
      assertEquals(true, actual);
    }

    @Test
    void testCheckIfTheAlpahnumericIsNotValid(){
      //arrange
      PasswordChecker tst = new PasswordChecker(8, 16);
      //act
      boolean actual = tst.isAlphanumeric("hello-/Hosea");
      //assert
      assertEquals(false, actual);
    }
    @Test
    void testCheckIfTheAlpahnumericIsNull(){
      //arrange
      PasswordChecker tst = new PasswordChecker(8, 16);
      //act
      boolean actual = tst.isAlphanumeric("");
      //assert
      assertEquals(false, actual);
    }


  //describePasswordLength()
  @Test
  void testPasswordLengthIsDescribedAsShort(){
    //arrange
    PasswordChecker describe = new PasswordChecker(5, 9);
    //act
    String actual = describe.describePasswordLength("abs");
    //assert
    assertEquals("short", actual);
  }

  @Test
  void testPasswordLengthIsDescribedAsMedium(){
    //arrange
    PasswordChecker describe = new PasswordChecker(5, 9);
    //act
    String actual = describe.describePasswordLength("mediUmm");
    //assert
    assertEquals("medium", actual);
  }

  @Test
  void testPasswordLengthIsDescribedAsLong(){
    //arrange
    PasswordChecker describe = new PasswordChecker(5, 9);
    //act
    String actual = describe.describePasswordLength("thisisALongPassworddd");
    //assert
    assertEquals("long", actual);
  }

  //isBannedPassword()
  @Test
  void testIsBannedPasswordOnList(){
    //arrange
    PasswordChecker describe = new PasswordChecker(5, 9);
    //act
    boolean actual = describe.isBannedPassword("password");
    //assert
    assertEquals(true, actual);
  }
  @Test
  void testIsBannedPasswordOffList(){
    //arrange
    PasswordChecker describe = new PasswordChecker(5, 9);
    //act
    boolean actual = describe.isBannedPassword("helloHosea");
    //assert
    assertEquals(false, actual);
  }

  @Test
  void testIsBannedPasswordIsNull(){
    //arrange
    PasswordChecker describe = new PasswordChecker(5, 9);
    //act
    boolean actual = describe.isBannedPassword("");
    //assert
    assertEquals(true, actual);
  }
}
