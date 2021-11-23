public static void main(java.lang.String[] args) throws java.io.IOException {
    java.io.File f = new java.io.File(args[0]);
    simfinder.Calculator c = new simfinder.Calculator(simfinder.Parser.parseFile(f));
}