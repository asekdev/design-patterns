package Bridge;

public class DVDRemote extends AbstractRemote {

    public boolean isDVDPlaying = false;


    public DVDRemote(EntertainmentDevice ed) {
        super(ed);
    }

    @Override
    public void buttonNinePressed() {
        if(this.isDVDPlaying) {
            this.isDVDPlaying = false;
            System.out.println("Pausing the DVD");
        } else {
            this.isDVDPlaying = true;
            System.out.println("Playing the DVD");
        }
    }
}
