import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testIfStringInputIsTheSameLengthMedium() {
    // Arrange 
    PasswordChecker counter = new PasswordChecker(6,12);
    // Act
  String actual = counter.describePasswordLength("123456");
    // Assert

  }



}
