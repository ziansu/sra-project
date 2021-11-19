private static long apply(long permission, long allow, long deny) {
    deny &= ~allow;
    permission |= allow;
    permission &= ~deny;
    return permission;
}