@org.jruby.anno.JRubyMethod
public org.jruby.runtime.builtin.IRubyObject receiver(org.jruby.runtime.ThreadContext context) {
    if ((message) instanceof org.jruby.RubyNameError.RubyNameErrorMessage) {
        return ((org.jruby.RubyNameError.RubyNameErrorMessage) (message)).object;
    }
    throw context.runtime.newArgumentError("no receiver is available");
}