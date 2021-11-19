private static long apply(long permission, long allow, long deny) {
    permission &= ~deny;
    permission |= allow;
    return permission;
}