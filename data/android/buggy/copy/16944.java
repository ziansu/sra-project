public java.lang.String getID() {
    try {
        return ois.readUTF();
    } catch (java.io.IOException ex) {
        return null;
    } finally {
    }
}