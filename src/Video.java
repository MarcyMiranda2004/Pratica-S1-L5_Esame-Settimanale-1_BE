public class Video extends PlayableElement {
    private int brightness;

    public Video(String name, int durata, int volume, int brightness) {
        super(name, durata, volume);
        this.brightness = brightness;
    }

    public void brightnessUp() {
        if (brightness < 10) brightness++;
    }

    public void brightnessDown() {
        if (brightness > 0) brightness--;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getName() + " " + "!".repeat(volume) + " " + "*".repeat(brightness));
        }
    }
}
