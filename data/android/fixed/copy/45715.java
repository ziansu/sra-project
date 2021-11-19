private void runSpecial(me.okx.neim.token.Special sp, java.lang.String val) {
    me.okx.neim.stack.NStack ns = sp.special(stack, val, this);
    stack = ns;
}