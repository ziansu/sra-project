public int compare(Task t1, Task t2) {
    java.lang.Integer i1 = t1.remainingCpuBurst;
    java.lang.Integer i2 = t2.remainingCpuBurst;
    return i1.compareTo(i2);
}