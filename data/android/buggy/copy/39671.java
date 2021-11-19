public static <T extends java.lang.Iterable<E>, E extends java.io.Serializable> void print(myUtils.ConsolePrinting.COLOR c, T o) {
    myUtils.ConsolePrinting.print(c);
    myUtils.ConsolePrinting.print(o);
    myUtils.ConsolePrinting.print(myUtils.ConsolePrinting.ANSI_RESET);
}