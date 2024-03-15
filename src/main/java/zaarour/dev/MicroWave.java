package zaarour.dev;

import java.util.Objects;

public class MicroWave implements EmWave {
    private final String frequency;

    public MicroWave(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public void generate() {
        System.out.println("Generating Micro wave with f="+ this.frequency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MicroWave microWave)) return false;
        return Objects.equals(frequency, microWave.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency);
    }
}