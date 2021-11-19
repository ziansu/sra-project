public static void main(java.lang.String[] args) {
    org.vukfactory.iamone.util.IAOsetResultPath objsetPath = new org.vukfactory.iamone.util.IAOsetResultPath();
    try {
        objsetPath.setResultsPath(args[0]);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}