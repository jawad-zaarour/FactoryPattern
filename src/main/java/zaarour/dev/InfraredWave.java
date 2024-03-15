package zaarour.dev;


import java.util.Objects;

public class InfraredWave implements EmWave {
    private final String frequency;

    public InfraredWave(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public void generate() {
        System.out.println("Generating Infrared wave with f="+ this.frequency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfraredWave that)) return false;
        return Objects.equals(frequency, that.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency);
    }
}