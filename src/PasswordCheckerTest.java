import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }

  @Test
  public void testIfAllLettersIsAlphanumeric() {
    PasswordChecker passcheck = new PasswordChecker(6, 12);
    boolean isAlpha = passcheck.isAlphanumeric("qwertyuiopasdfghjklzxcvbnm");
    assertEquals(true, isAlpha);
  }

  @Test
  public void testIfPasswordEmpty() {
    PasswordChecker passcheck = new PasswordChecker(6, 12);
    String isEmpty = passcheck.describePasswordLength("");
    assertEquals("short", isEmpty);
  }

  @Test
  public void testIfPasswordContainsSymbol() {
    PasswordChecker passcheck = new PasswordChecker(1, 2);
    boolean isValid = passcheck.isAlphanumeric("asd$");
    assertEquals(false, isValid);
  }

  @Test
  public void testIsBannedPasswords() {
      PasswordChecker passcheck = new PasswordChecker(6, 12);
      boolean isValid = passcheck.isBannedPassword("qwerty");
      assertEquals(true, isValid);
  }

  @Test
  public void testIsBannedWithSymbolsAndNumbers() {
    PasswordChecker passcheck = new PasswordChecker(6, 12);
    boolean isBanned = passcheck.isBannedPassword("PASSword123$");
    assertEquals(false, isBanned);
  }

  @Test
  public void testIsBannedWithValidPassword() {
    PasswordChecker passcheck = new PasswordChecker(6, 12);
    boolean isBanned = passcheck.isBannedPassword("SuperCooler12345!");
    assertEquals(false, isBanned);
  }

  @Test
  public void testPassLengthExactShort() {
    PasswordChecker passcheck = new PasswordChecker(3, 6);
    String isShort = passcheck.describePasswordLength("dog");
    assertEquals("short", isShort);
  }
}
