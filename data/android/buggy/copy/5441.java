public void removeCardFile(ch.zbw.karteiSystem.CardFile ID) {
    getOldScore();
    try {
        this.cardfiles.remove(ID);
    } catch (java.lang.Exception e) {
    }
}