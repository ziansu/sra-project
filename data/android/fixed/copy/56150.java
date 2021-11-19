public static boolean matchParameters(java.lang.String param, java.lang.String[] cases) {
    boolean check = false;
    for (java.lang.String str : cases) {
        if (param.equals(str)) {
            check = true;
            break;
        }
    }
    return check;
}