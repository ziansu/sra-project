public static void printResult(java.util.List<java.lang.Double[]> result) {
    ua.kh.khpi.alex_babenko.utils.Printer.LOG.warn("NETWORK ATTACKS: ");
    result.stream().map(ua.kh.khpi.alex_babenko.utils.Printer::createLine).forEach(ua.kh.khpi.alex_babenko.utils.Printer.LOG::warn);
}