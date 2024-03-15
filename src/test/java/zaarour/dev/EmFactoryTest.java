package zaarour.dev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmFactoryTest {

    private static final RadioWave RADIO_WAVE = new RadioWave("3");
    private static final MicroWave MICRO_WAVE = new MicroWave("300");
    private static final InfraredWave INFRARED_WAVE = new InfraredWave("3000");

    @Test
    void create_shouldReturnTheCorrectCarInstance() {
        Assertions.assertAll("Creating EmWaves",
                () -> {
                    EmWave radiowave = EmWaveFactory.create(EmWaveType.RADIO, "3");
                    Assertions.assertEquals(RADIO_WAVE, radiowave);
                },
                () -> {
                    EmWave microwave = EmWaveFactory.create(EmWaveType.MICROWAVE, "300");
                    Assertions.assertEquals(MICRO_WAVE, microwave);
                },
                () -> {
                    EmWave infrared = EmWaveFactory.create(EmWaveType.INFRARED, "3000");
                    Assertions.assertEquals(INFRARED_WAVE, infrared);
                }
        );
    }
}
