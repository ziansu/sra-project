@java.lang.Override
public void evaluate(java.math.BigInteger value) {
    if (value != null) {
        (count)++;
        sum = sum.add(value);
        evaluateMinMax(value);
    }
}