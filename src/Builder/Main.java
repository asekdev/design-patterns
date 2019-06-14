package Builder;

public class Main {

    public static void main(String[] args) {

        Phone iPhone = new Phone("iOS", 5.5, "Gunmetal Grey");

        System.out.println(iPhone.toString());

        PhoneBuilder builder = new PhoneBuilder();

        builder.addColour("Red");
        builder.addScreenSize(6.5);

        Phone android = builder.getPhone();

        System.out.println(android);

    }
}
