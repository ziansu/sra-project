@java.lang.Override
public void evaluate(int value) {
    (count)++;
    sum += value;
    evaluateMinMax(value);
}