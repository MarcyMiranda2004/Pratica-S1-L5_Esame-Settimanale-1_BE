public class Audio extends PlayableElement {

    public Audio(String name, int durata, int volume) {
        super(name, durata, volume);
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getName() + " " + "!".repeat(volume));
        }
    }
}
