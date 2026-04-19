import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

 
  //constructor 1: Test to see if password passes with spaces  | should not
@Test 
public void testPasswordWithSpacesInBetween() {
  //arrange
    PasswordChecker checker = new PasswordChecker(8, 12);
    String password = "pass word";
  //act
    boolean result = checker.isAlphanumeric(password);
  //assert
    assertEquals(false, result);
  
}
@Test
public void testPasswordWithSpacesAtBeginning() {
  //arrange
    PasswordChecker checker = new PasswordChecker(8, 12);
    String password = " pass";
  //act
    boolean result = checker.isAlphanumeric(password);
  //assert
    assertEquals(false, result);
}
@Test
public void testPasswordWithSpacesAtEnd() {
  //arrange
    PasswordChecker checker = new PasswordChecker(8, 12);
    String password = "password ";
  //act
    boolean result = checker.isAlphanumeric(password);
  //assert
    assertEquals(false, result);
}



// constructor 2: Test to see if password is banned | should be

 // Test to see if exact banned password is caught | should be banned
    @Test
    public void testIsBannedPasswordExactMatch() {
        // Arrange
        PasswordChecker checker = new PasswordChecker(6, 12);
        // Act + Assert — "password" is in the default banned list
        assertEquals(true, checker.isBannedPassword("password"));
    }
    @Test
    public void testIsBannedPasswordCaseInsensitive() {
        // Arrange
        PasswordChecker checker = new PasswordChecker(6, 12);
        // Act n Assert 
        assertEquals(true, checker.isBannedPassword("Password"));
    }

    // Test to see if a nonbanned password is allowed | should not be banned
    @Test
    public void testIsBannedPasswordNotBanned() {
        // Arrange
        PasswordChecker checker = new PasswordChecker(6, 12);
        // Act n Assert 
        assertEquals(false, checker.isBannedPassword("correctHorse99"));
    }




    // constructor 3: Test to see if password is valid | should be

     @Test // Test to see if a valid password is accepted | should be valid
    public void testDescribePasswordLengthShort() {
        // Arrange
        PasswordChecker checker = new PasswordChecker(6, 12);
        String password = "hi";        // length 2 which is below short Threshold of 6
        // Act
        String result = checker.describePasswordLength(password);
        // Assert
        assertEquals("short", result);
    }

      @Test
    public void testDescribePasswordLengthMedium() {
        // Arrange
        PasswordChecker checker = new PasswordChecker(6, 12);
        String password = "hello1";   
        // Act
        String result = checker.describePasswordLength(password);
        // Assert
        assertEquals("medium", result);
    }

    // Test to see if a long password is described as "long" | should be long
}