import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

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
    Boolean isFalse = checker.isAlphanumeric("ABC@  DEF");

    //assert
    assertFalse(isFalse);
  }
  @Test
  public void testIsAlphanumericContainSymbol(){
    //arrange
    PasswordChecker checker = new PasswordChecker(3, 7);

    //act
    Boolean answer = checker.isAlphanumeric("A@BC_DE#WF");

    //assert
    assertFalse(answer);
  }


  @Test
  public void testDescribePasswordLength() {
    //arrange
    PasswordChecker checker = new PasswordChecker(3, 6);

    //act
    String actual = checker.describePasswordLength("harry");

    //assert
    assertEquals("medium", actual);
  }

  @Test 
  public void testDescribePasswordLengthShort(){
    PasswordChecker checker = new PasswordChecker(6, 9);

    String actual = checker.describePasswordLength("pop");

    assertEquals("short", actual);
  }

}
