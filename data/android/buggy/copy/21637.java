public static void dropCatalogue() {
    assignment.Catalogue.instance = null;
    java.lang.System.gc();
}