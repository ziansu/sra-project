@java.lang.Override
public void first_scan_look() {
    scan_look_default();
    mergeSort(displacementCounter, ((requestQueue.size()) - 1), false);
    absoluteSetSeek();
}