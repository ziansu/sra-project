@java.lang.Override
public int compare(java.util.Map.Entry<java.lang.String, java.lang.Integer> entry1, java.util.Map.Entry<java.lang.String, java.lang.Integer> entry2) {
    return entry2.getValue().compareTo(entry1.getValue());
}