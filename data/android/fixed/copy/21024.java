public void setSignatures(java.util.List<byte[]> signatures) {
    this.signatures.clear();
    if (signatures != null) {
        this.signatures.addAll(signatures);
    }
}