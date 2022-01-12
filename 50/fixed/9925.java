@java.lang.Override
public void evaluate(java.math.BigInteger value) {
    if (value != null) {
        long x = value.longValue();
        evaluateMinMax(x);
        (count)++;
        sum += x;
    }
}