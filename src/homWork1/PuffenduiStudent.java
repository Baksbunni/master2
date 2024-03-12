package homWork1;

public class PuffenduiStudent extends HogwartsStudent {
    private final int hardWorking;
    private final int loyal;
    private final int honest;

    public PuffenduiStudent(String name, int magicPower, int transgressionDistance,
                            int hardWorking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardWorking = hardWorking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return getName();
    }
}

