package zaarour.dev;

import java.util.Map;

import static zaarour.dev.EmWaveType.*;

public class EmWaveFactory {

    private static final Map<EmWaveType, EmWaveCreator> EMWAVE_FACTORY_MAP = Map.of(
            INFRARED, InfraredWave::new,
            MICROWAVE, MicroWave::new,
            RADIO, RadioWave::new
    );

    private EmWaveFactory() {
    }

    static EmWave create(EmWaveType type, String frequency) {
        if (EMWAVE_FACTORY_MAP.containsKey(type)) {
            return EMWAVE_FACTORY_MAP.get(type).initialize(frequency);
        }
        throw new UnsupportedOperationException();
    }

    private interface EmWaveCreator {
        EmWave initialize(String frequency);
    }
}
