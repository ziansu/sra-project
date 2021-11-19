private void replaceContentAtSpecificPoint() {
    askForPosition();
    askForInput();
    try {
        list.set(position, content);
        java.lang.System.out.println("Erfolgreich ersetzt!");
    } catch (java.lang.IllegalArgumentException e) {
        java.lang.System.err.println(e.getMessage());
    }
}