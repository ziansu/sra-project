private java.lang.String createMessage(java.lang.String message, java.lang.Object... args) {
    return (args.length) == 0 ? message : java.lang.String.format(message, args);
}