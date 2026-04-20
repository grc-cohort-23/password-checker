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
    PasswordChecker checker2 = new PasswordChecker(4 , 9);

    Boolean expected = checker2.isBannedPassword("howdy");

    assertFalse(expected);

  }

  @Test
  public void testIsBannedPasswordNull(){
    PasswordChecker checker3 = new PasswordChecker(2, 6);

    Boolean isNull = checker3.isBannedPassword("");

    assertFalse(isNull);


  }

}
