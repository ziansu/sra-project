public static void main(java.lang.String[] args) {
    simfinder.File f = new simfinder.File(args[0]);
    simfinder.Calculator c = new simfinder.Calculator(simfinder.Parser.parseFile(f));
}