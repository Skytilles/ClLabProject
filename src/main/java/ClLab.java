import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClLab implements ClLabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String regex = "^[A-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(myString);

        return matcher.groupCount() > 0? true : false;
    }

}

