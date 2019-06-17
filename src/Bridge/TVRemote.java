package Bridge;

public class TVRemote extends AbstractRemote {

    public TVRemote(EntertainmentDevice ed) {
        super(ed);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("Muting the TV");
    }
}
