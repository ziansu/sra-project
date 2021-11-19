public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Running Tests: jpx.slick");
    boolean pass = jpx.slick.layout.Test_SlickLayout.runTest();
    java.lang.System.out.println(("All tests: " + (pass ? "PASS" : "FAIL")));
}