public static void main(java.lang.String[] args) {
    try {
        new org.karin.util.dzone.refcard.DZoneRefcardDownloader().main();
    } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
}