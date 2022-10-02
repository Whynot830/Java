package pr12_15.ex1;

public class Person {
    private String name;
    private String surname;
    private String midname;

    public Person(String surname, String name, String midname) {
        this.name = name;
        this.surname = surname;
        this.midname = midname;
    }

    public StringBuffer getIn(String str) {
        StringBuffer res = new StringBuffer();
        if (!str.isEmpty()) {
            return res.append(str.charAt(0)).append(".");
        }
        return res;
    }

    public String getFIO() {
        StringBuffer result = surname.isEmpty() ? new StringBuffer() : new StringBuffer(surname).append(" ");
        StringBuffer tmp;

        tmp = getIn(name);
        result.append(tmp);
        if (!tmp.isEmpty())
            result.append(" ");

        tmp = getIn(midname);
        result.append(tmp);
        if (!tmp.isEmpty())
            result.append(" ");

        return result.toString();
    }
}
