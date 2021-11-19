public void exit() {
    com.google.common.base.Preconditions.checkState(((authScope) != null), "No scoping block in progress");
    authScope = null;
}