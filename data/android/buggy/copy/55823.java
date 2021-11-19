static java.lang.String generateCode() {
    java.util.Random r = new java.util.Random();
    java.lang.Integer randomSixDigitCode = (r.nextInt(900000)) + 100000;
    return randomSixDigitCode.toString();
}