public abstract class PlayableElement extends MultimedialElement implements Play {
    protected int durata;
    protected int volume;

    public PlayableElement(String name, int durata, int volume) {
        super(name);
        this.durata = durata;
        this.volume = volume;
    }

    public abstract void play();

    public void volumeUp() {
        if (volume < 10) volume++;
    }

    public void volumeDown() {
        if (volume > 0) volume--;
    }
}
