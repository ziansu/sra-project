private static void checkValue(int v) throws java.lang.Exception {
    if ((v < 1) || (v > 4))
        throw new java.lang.Exception("Value needs to be 1-4.\nFor clearing use the clear(int, int, ..) methods");
    
}