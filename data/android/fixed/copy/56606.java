public boolean isEncrypted() {
    return java.util.Arrays.equals(this.encrypted, new byte[1]) ? false : true;
}