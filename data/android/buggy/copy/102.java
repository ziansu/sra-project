public void flush() {
    dataset.commit();
    dataset.close();
}