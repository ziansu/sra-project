private org.jruby.exceptions.RaiseException notStructMemberError(java.lang.String name) {
    return getRuntime().newNameError((("no member '" + name) + "' in struct"), this, name);
}