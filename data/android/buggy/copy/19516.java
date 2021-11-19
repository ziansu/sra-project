public static void testWithObjects() {
    java.lang.Boolean b1 = true;
    java.lang.Boolean b2 = false;
    java.lang.Boolean b3 = b1 | b2;
    assert b3;
    b3 &= b1;
    b1 |= b3;
    b1 = b1 ^ b2;
    assert b1;
}