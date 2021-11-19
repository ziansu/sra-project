public void sortTable(java.util.List<Controller.IPowerItemController> originalS, java.util.List<Controller.IPowerItemController> originalW, int select) {
    combined = originalS;
    combined.addAll(originalW);
    Controller.Mergesort.sort(combined, select);
}