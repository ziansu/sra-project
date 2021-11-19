public static boolean isEmailValid(java.lang.String room_name) {
    return !(room_name.matches("^.*[^a-zA-Z0-9 ].*$"));
}