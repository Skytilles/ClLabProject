import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClLab implements ClLabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public String setString(String string) {
        myString = string;
        return string;
    }

    @Override
    public String detectCapitalUse() {
        String regex = "^[A-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(myString);

        return String.valueOf(matcher.groupCount() > 0? true : false);
    }

}

