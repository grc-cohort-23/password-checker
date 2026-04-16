import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }

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


}
