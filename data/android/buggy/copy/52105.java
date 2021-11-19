public static <T extends java.lang.Comparable<? super T>> void qSortHoare(T[] a) {
    if ((a.length) <= 1)
        return ;
    
    granatamammolo.Java.granatamammolo.sort.Sorting.qSortHoareRic(a, 0, a.length);
}