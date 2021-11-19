@java.lang.Override
public int compareTo(com.dataloom.data.analytics.LongWeightedId o) {
    int value = java.lang.Long.compare(weight, o.weight);
    if (value == 0) {
        value = id.compareTo(o.id);
    }
    return value;
}