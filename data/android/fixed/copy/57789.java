public void close() {
    try {
        if ((timer) != null)
            timer.stop();
        
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}