package Singleton;

public class CEO implements IPower {

    private String name;
    private String company;

    private static CEO instance = null;

    private CEO(){}

    public static CEO getInstance() {
        //if no singleton has been initialised, create a new one
        if(instance == null) {
            instance = new CEO();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String toString() {
        return this.getName() + " is CEO of " + this.getCompany();
    }

    @Override
    public void fireEmployee(String employee) {
        System.out.println(employee + ", you're FIRED!");
    }

    public void removeCEO() {
        instance = null;
    }
}
