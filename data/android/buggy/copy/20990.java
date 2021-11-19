@java.lang.Override
public int compareTo(measure.Measurement p) {
    if (((date) != null) && ((p.date) != null)) {
        return p.date.compareTo(date);
    }
    return -1;
}