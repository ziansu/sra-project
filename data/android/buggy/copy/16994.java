private static boolean isFirstChar(nez.lang.Expression e) {
    if ((e instanceof nez.lang.Nez.Pair) || (e instanceof nez.lang.Nez.Sequence)) {
        return (e.get(0)) instanceof nez.lang.Nez.Byte;
    }
    return e instanceof nez.lang.Nez.Byte;
}