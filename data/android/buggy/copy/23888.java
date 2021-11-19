public static boolean validateCauseCode(java.lang.Integer input) {
    try {
        if ((input < 0) || (input > 33)) {
            return false;
        }
    } catch (java.lang.NullPointerException e) {
        return false;
    }
    return true;
}