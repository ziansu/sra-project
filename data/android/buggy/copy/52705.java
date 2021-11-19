public static boolean isRootCall() {
    return org.jcoro.Coro.getUnsafe().statesStack.empty();
}