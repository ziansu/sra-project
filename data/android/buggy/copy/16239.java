public static void equalToMinLen(@MinLen(value = 2)
java.lang.String m, @MinLen(value = 0)
java.lang.String r) {
    if (r == m) {
        @MinLen(value = 2)
        java.lang.String j = r;
    }
}