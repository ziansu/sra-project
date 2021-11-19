public java.util.ArrayList<NamedItem<IMatrice>> getMatrices() {
    java.lang.System.out.println("start");
    for (NamedItem<IMatrice> matriceNamedItem : matrices) {
        java.lang.System.out.println(matriceNamedItem.getName());
    }
    java.lang.System.out.println("end");
    return matrices;
}