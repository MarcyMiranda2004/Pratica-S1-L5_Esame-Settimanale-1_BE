public class Image extends NotPlayableElement implements Show{

    public Image(String name, int brightness) {
        super(name, brightness);
    }

    @Override
    public void show() {
        System.out.println(getName() + " " + "*".repeat(brightness));

    }
}
