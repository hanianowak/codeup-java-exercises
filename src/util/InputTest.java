package util;

public class InputTest {
    public static void main(String[] args) {

        Input cos = new Input();
        cos.getString();

        Input cos2 = new Input();
        boolean coscos = cos2.yesNo();
        System.out.println(coscos);

        Input cos3 = new Input();
        cos3.getInt(4,10);


        Input cos4 = new Input();
        cos4.getInt();

        Input cos5 = new Input();
        cos5.getDouble(3, 200);

        Input cos6 = new Input();
        cos6.getDouble();

    }
}
