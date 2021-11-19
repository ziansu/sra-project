public void flushAll() {
    java.util.List<T> toProcess = new java.util.ArrayList<T>();
    toProcess.addAll(inbox);
    processor.process(toProcess);
    lastProcessedTime = java.lang.System.currentTimeMillis();
    inbox.clear();
}