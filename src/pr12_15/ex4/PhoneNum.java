package pr12_15.ex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNum {
    private String number;

    public PhoneNum(String num) {
        number = num;
    }

    public void format_num() {
        String tmp = number;
        if (tmp.charAt(0) == '8')
            tmp = "+7" + tmp.substring(1);

        Pattern p = Pattern.compile("(\\+\\d+)(\\d{3})(\\d{3})(\\d{4})$");
        Matcher m = p.matcher(tmp);
        m.find();
        number = m.group(1) + ' ' + m.group(2) + '-' + m.group(3) + '-' + m.group(4);
    }

    @Override
    public String toString() {
        return "PhoneNum{" +
                "number='" + number + '\'' +
                '}';
    }
}
