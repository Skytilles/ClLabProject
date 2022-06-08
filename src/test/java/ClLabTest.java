import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
      String a = "Test String";
      String actual = m.setString(a);
        assertTrue(a == actual.getString(), true, "Test String");
    }
    @Test
    public void noCapitalLetters(){
        String a = "abcde";
        String actual = m.detectCapitalUse();
        assertTrue();
    }

    @Test
    public void yesCapitalLetters(){
        String a = "abCde";
        String actual = m.detectCapitalUse();

    }


}
