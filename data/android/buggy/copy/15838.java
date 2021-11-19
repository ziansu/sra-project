public void sortTable(java.util.List<Controller.IPowerItemController> originalS, java.util.List<Controller.IPowerItemController> originalW) {
    combined = originalS;
    combined.addAll(originalW);
    Controller.Mergesort.sort(combined, 0);
}