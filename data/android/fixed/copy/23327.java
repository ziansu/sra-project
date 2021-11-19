private static boolean checkIsNumber(java.lang.String s) {
    if (s.matches("[0-9]*")) {
        java.lang.System.out.println("It`s a number");
        return true;
    }
    java.lang.System.out.println(("It`s not a number: " + s));
    return false;
}