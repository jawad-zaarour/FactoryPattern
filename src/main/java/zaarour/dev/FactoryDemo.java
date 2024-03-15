package zaarour.dev;

public class FactoryDemo
{
    public static void main( String[] args )
    {
        //suppose the unit of frequency is MHz
        EmWave radiowave = EmWaveFactory.create(EmWaveType.RADIO, "3");
        EmWave microwave = EmWaveFactory.create(EmWaveType.MICROWAVE, "300");
        EmWave infrared = EmWaveFactory.create(EmWaveType.INFRARED, "3000");

        radiowave.generate();
        microwave.generate();
        infrared.generate();
    }
}
