package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements PCComponent {

    private String name;
    private List<PCComponent> components = new ArrayList<PCComponent>();


    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(PCComponent pcComponent) {
        components.add(pcComponent);
    }

    @Override
    public void showPrice() {

        System.out.println(this.name);

        for(PCComponent pcComponent : components) {
            pcComponent.showPrice();
        }
    }

    @Override
    public int getTotal() {
        int total = 0;


        for(PCComponent pcComponent : components) {
            total += pcComponent.getTotal();
        }

        return total;
    }

    public void showTotal() {
        System.out.println("Total for " + this.name + ": $" + this.getTotal());
    }
}
