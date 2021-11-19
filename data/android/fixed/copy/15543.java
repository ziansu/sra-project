private int GetTargetByte(int cipher, int key) {
    int retval;
    retval = cipher ^ key;
    retval = inverseSBox[retval];
    return retval;
}