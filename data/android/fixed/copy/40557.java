private void getPackage(java.lang.Class clazz) {
    if ((clazz.getPackage()) != null) {
        sb.append(clazz.getPackage()).append(";").append("\n\n");
    }
}