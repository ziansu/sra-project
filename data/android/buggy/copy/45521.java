void finaliza() {
    if ((in) != null) {
        try {
            in.close();
        } catch (java.io.IOException e) {
        }
    }
    in = null;
}