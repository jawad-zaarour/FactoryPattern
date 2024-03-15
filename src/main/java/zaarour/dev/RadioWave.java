package zaarour.dev;

import java.util.Objects;

public class RadioWave implements EmWave {
    private final String frequency;

    public RadioWave(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public void generate() {
        System.out.println("Generating Radio wave with f="+ this.frequency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RadioWave radioWave)) return false;
        return Objects.equals(frequency, radioWave.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency);
    }
}