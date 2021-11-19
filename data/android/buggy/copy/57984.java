protected static boolean hasCommand(java.lang.String command) {
    return ((console.Docopt.args.length) >= 1) && (console.Docopt.args[0].equals(command));
}