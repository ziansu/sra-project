private void sort() {
    if ((sorter) != null) {
        java.util.Collections.sort(backingAppInfoList, sorter);
    }
}