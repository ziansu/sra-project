public void close() {
    if ((br) != null) {
        try {
            br.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}