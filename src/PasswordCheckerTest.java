import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
    void testIsAlphanumeric_ReturnsFalseForSpecialCharacters() {
        // Arrange
        PasswordChecker checker = new PasswordChecker(5, 10);
        // Act
        boolean result = checker.isAlphanumeric("pass!word");
        // Assert
        assertFalse(result);
    }
  @Test
    void testIsAlphanumeric_ReturnsFalseForSpaces() {
      // Arrange
      PasswordChecker checker = new PasswordChecker(5, 10);
      // Act
      boolean result = checker.isAlphanumeric("pass word");
      // Assert
      assertFalse(result);
    }


    @Test 
    void testIsAlphaNumeric_ReturnsTrueForValidPassword() {
      //arrange
      PasswordChecker checker = new PasswordChecker(5, 10);
      //act
      boolean result = checker.isAlphanumeric("passwords987");
      //assert
      assertTrue(result);
    }

    
}
