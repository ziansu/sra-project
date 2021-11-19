@java.lang.Override
public synchronized void pollute(double pollution) {
    this.pollution += pollution;
    edu.mscd.thesis.util.Util.boundValue(pollution, 0, Rules.MAX);
}