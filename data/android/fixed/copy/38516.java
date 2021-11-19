@java.lang.Override
public synchronized void pollute(double pollution) {
    this.pollution += pollution;
    this.pollution = edu.mscd.thesis.util.Util.boundValue(this.pollution, 0, Rules.MAX);
}