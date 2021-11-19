public static void main(java.lang.String[] args) {
    java.lang.String password = "admin";
    java.lang.String encodePassword = com.csc.ultil.PasswordUtils.encodePassword(password);
    java.lang.System.out.println(encodePassword);
}