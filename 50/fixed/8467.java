private static void launch(org.teavm.classlib.java.lang.TThread thread) {
    (org.teavm.classlib.java.lang.TThread.activeCount)++;
    org.teavm.classlib.java.lang.TThread.setCurrentThread(thread);
    thread.run();
    (org.teavm.classlib.java.lang.TThread.activeCount)--;
    org.teavm.classlib.java.lang.TThread.setCurrentThread(org.teavm.classlib.java.lang.TThread.mainThread);
}