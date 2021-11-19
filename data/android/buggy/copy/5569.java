@java.lang.Override
public int calculateTotal() {
    int lower = calculateLowerPoints();
    int bonus = (lower > 63) ? 35 : 0;
    int upper = calculateUpperPoints();
    return (lower + bonus) + upper;
}