import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import java.util.*;

public class PasswordCheckerTest {

  
  @Test
  public void testIsBannedPasswordTrue() {
    //Arrange 
    PasswordChecker checker = new PasswordChecker(3, 7);
    //Act
    Boolean actual = checker.isBannedPassword("hello");
    //Assert
    assertTrue(actual);
  
  }
  @Test
  public void testIsBannedPasswordFalse(){
    PasswordChecker checker = new PasswordChecker(4 , 9);

    Boolean expected = checker.isBannedPassword("howdy");

    assertFalse(expected);

  }

  @Test
  public void testIsBannedPasswordNull(){
    PasswordChecker checker = new PasswordChecker(2, 6);

    Boolean isNull = checker.isBannedPassword("");

    assertTrue(isNull);


  }
  @Test 
  public void testIsAlphanumericTrue(){
    //arrange 
    PasswordChecker checker = new PasswordChecker(2,8);
    //act
    Boolean isTrue = checker.isAlphanumeric("Ab23cd45");
    //assert
    assertTrue(isTrue);
  }

  @Test
  public void testIsAlphanumericFalse(){
    //arrange
    PasswordChecker checker = new PasswordChecker(3, 7);

    //act
    Boolean isFalse = checker.isAlphanumeric("ABC DEF");

    //assert
    assertFalse(isFalse);
  }

//   @Test
//   public void testDescribePasswordLength() {
//     //arrange

//     //act

//     //assert
//   }

}
