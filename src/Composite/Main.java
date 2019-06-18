package Composite;

public class Main {

    public static void main(String[] args) {

        PCComponent hdd = new Item("Hard Drive", 1500);
        PCComponent monitor = new Item("144hz Samsung", 750);
        PCComponent gcard = new Item("GTX 2080ti", 1900);
        PCComponent mouse = new Item("Logitech Gaming Mouse", 125);
        PCComponent keyboard = new Item("CherryMX Brown", 225);

        Composite motherboard = new Composite("Motherboard");

        motherboard.addComponent(hdd);
        motherboard.addComponent(gcard);

        Composite peripherals = new Composite("Peripherals");

        peripherals.addComponent(monitor);
        peripherals.addComponent(mouse);
        peripherals.addComponent(keyboard);

        Composite pcbuild = new Composite("PC Build");

        pcbuild.addComponent(motherboard);
        pcbuild.addComponent(peripherals);

        pcbuild.showPrice();
        pcbuild.showTotal();

    }
}
