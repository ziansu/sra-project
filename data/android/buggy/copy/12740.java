public static void main(java.lang.String[] args) {
    if ((args.length) != 1) {
        new main.Window(false);
    }else {
        new main.Window(java.lang.Boolean.getBoolean(args[0].toLowerCase()));
    }
}