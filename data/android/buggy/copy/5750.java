public static void main(java.lang.String[] args) throws CheckerException, java.io.IOException, org.json.simple.parser.ParseException {
    java.lang.String trustedJSONString = FileReader.readFile("/Users/YUAN/Desktop/nodejs/public/json/test.json");
    java.lang.String untrustedJSONString = FileReader.readFile("/Users/YUAN/Desktop/nodejs/public/json/drawn.json");
    java.lang.System.out.println(Checker.test(trustedJSONString, untrustedJSONString));
}