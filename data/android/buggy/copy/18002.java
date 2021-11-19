public static void main(java.lang.String... args) {
    edu.learn.java.ds.sort.MergeSort ms = new edu.learn.java.ds.sort.MergeSort();
    ms.printArray();
    ms.mergeSort(0, ms.array.length);
    ms.printArray();
}