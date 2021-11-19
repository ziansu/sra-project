public static int stripStart(int h, int task, int tasks) {
    int striph = h / tasks;
    int h0 = task * striph;
    return h0;
}