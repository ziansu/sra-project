public static boolean isValid(final java.lang.String address) {
    return xyz.enhorse.commons.Email.PATTERN.matcher(address).matches();
}