package Singleton;

public class Main {
    public static void main(String[] args) {

        //Create singleton here
        CEO ceo = CEO.getInstance();

        ceo.setName("John Doe");
        ceo.setCompany("ABC Technologies");

        System.out.println("Current CEO:");
        System.out.println(ceo.toString());

        //Reference the created singleton here
        CEO anotherCEO = CEO.getInstance();

        //Should be the same CEO as it's the same instance,
        //unless we modify its properties with setters
        System.out.println("New CEO:");
        System.out.println(anotherCEO.toString());


        //There can only be one CEO at a time.

        anotherCEO.fireEmployee("Jimbo");
        anotherCEO.removeCEO();

        System.out.println(anotherCEO.toString());

    }
}
