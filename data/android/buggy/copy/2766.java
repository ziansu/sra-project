@com.oracle.truffle.api.dsl.Specialization(guards = "isRubyString(file)")
public boolean load(com.oracle.truffle.api.frame.VirtualFrame frame, com.oracle.truffle.api.object.DynamicObject file, org.jruby.truffle.runtime.NotProvided wrap) {
    return load(frame, file, false);
}