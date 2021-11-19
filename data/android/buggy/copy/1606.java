public void setImageLocation(java.io.File file) {
    if ((mimageStore) != null) {
        mimageStore.delete();
        mimageStore = file;
    }else {
        mimageStore = file;
    }
}