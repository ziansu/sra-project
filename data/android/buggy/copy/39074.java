private static boolean usingLnf(java.lang.Class lnfClass) {
    java.lang.String currentLnfClass = javax.swing.UIManager.getLookAndFeel().getClass().getName();
    return currentLnfClass.equals(lnfClass.getName());
}