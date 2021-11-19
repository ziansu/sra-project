public void stopNet() {
    isStart = false;
    try {
        ois.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}