@java.lang.Override
public double getWeightValue(int time) {
    return java.lang.Math.exp((time * (this.decayRate)));
}