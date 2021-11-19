@java.lang.Override
public void noteOn(double frequency, double amplitude, com.softsynth.shared.time.TimeStamp timeStamp) {
    freqAdder.inputA.set(frequency, timeStamp);
    java.lang.System.out.println("coucou");
    ampEnv.input.on(timeStamp);
}