java.lang.Object fireEvent(java.lang.String method, java.lang.Object... args) {
    final com.supermomonga.rukkit.RubyEnvironment env = jruby.get();
    com.google.common.base.Preconditions.checkState((env != null));
    return fireEvent(env, method, args);
}