public java.lang.Object importObject(com.oracle.truffle.api.object.DynamicObject name) {
    assert org.jruby.truffle.language.RubyGuards.isRubyString(name);
    return context.getEnv().importSymbol(name.toString());
}