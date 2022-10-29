package pr19_20;

public class LicensePlate {
    private final String plate;


    LicensePlate() {
        String letters = "АВЕКМНОРСТУХ";
        StringBuffer buff = new StringBuffer();
        buff.append(letters.charAt((int) (Math.random() * 12)));
        int num = (int) (Math.random() * 10);
        for (int i = 0; i < 3; i++)
            buff.append(num);
        buff.append(letters.charAt((int) (Math.random() * 12)));
        buff.append(letters.charAt((int) (Math.random() * 12)));
        num = (int) (Math.random() * 199 + 1);
        if (num < 10)
            buff.append("0").append(num);
        else buff.append(num);
        plate = buff.toString();
    }

    public String getPlateNumber() {
        return plate;
    }

    @Override
    public String toString() {
        return plate;
    }
}
