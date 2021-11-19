public void cleanUp() {
    java.lang.System.out.println(sigs.toString());
    sigs.clear();
    start.getCode().cleanUp(this);
    java.lang.System.out.println(sigs.toString());
}