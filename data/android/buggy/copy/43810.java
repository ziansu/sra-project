public static boolean passwordInvalid(java.lang.String password) {
    boolean invalid = true;
    if (password.equals("admin")) {
        invalid = false;
    }
    return invalid;
}