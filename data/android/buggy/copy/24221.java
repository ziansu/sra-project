public void persist() throws java.io.IOException {
    synchronized(refreshLock) {
        ramWriter.commit();
        ramWriter.close();
        persistWriter.addIndexes(ramDir);
        persistWriter.commit();
        reset();
    }
}