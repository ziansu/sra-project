private boolean isInteger(java.lang.String s) {
    try {
        java.lang.Integer.parseInt(s);
    } catch (java.lang.NumberFormatException e) {
        return false;
    } catch (java.lang.NullPointerException e) {
        return false;
    }
    return true;
}