@java.lang.Override
public void popped() {
    if ((clazz) != null) {
        if (clazz.contains("lang:java")) {
            printer.println();
            printer.print("----");
            printer.println();
        }
    }
}