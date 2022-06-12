import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClLabTest {
    ClLab m;
    @BeforeEach
    void setUp() {m = new ClLab();}

    @Test
    public void stringSet(){
        String a = "Test String";
        String actual = m.setString(a);
        assertTrue(actual == a, "String should be \"Test String\"");
    }
    @Test
    public void getTheString(){
      String a = m.setString("Test String");
      String actual = m.getString();
      assertTrue(a == actual, "Test String");
    }
    @Test
    public void noCapitalLetters(){
        String a = m.setString("abcde");
        String actual = m.detectCapitalUse();
        assertFalse(a == actual, "String does not have a capital letter");
    }

    @Test
    public void yesCapitalLetters(){
        String a = m.setString("Abcde");
        String actual = m.detectCapitalUse();
        assertTrue(a == actual, "String has a capital letter");
    }


}
