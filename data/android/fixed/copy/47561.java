public int compare(int index1, int index2) {
    return shifts.getLine(index1).toUpperCase().compareTo(shifts.getLine(index2).toUpperCase());
}