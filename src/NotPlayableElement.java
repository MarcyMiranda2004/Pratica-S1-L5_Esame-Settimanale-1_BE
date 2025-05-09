public abstract class NotPlayableElement extends MultimedialElement {
    protected int brightness;

    public NotPlayableElement(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    public void brightnessUp() {
        if (brightness < 10) brightness++;
    }

    public void brightnessDown() {
        if (brightness > 0) brightness--;
    }
}
