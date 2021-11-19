private java.lang.String readLine(com.jantuomi.tunkki.repl.ConsoleReader reader, java.lang.String promptMessage) throws java.io.IOException {
    java.lang.String line = reader.readLine((promptMessage + "\ntunkki> "));
    return line.trim();
}