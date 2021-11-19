@org.jruby.anno.JRubyMethod
public org.jruby.runtime.builtin.IRubyObject receiver(org.jruby.runtime.ThreadContext context) {
    if ((name) instanceof org.jruby.RubyNameError.RubyNameErrorMessage) {
        return ((org.jruby.RubyNameError.RubyNameErrorMessage) (name)).object;
    }
    throw context.runtime.newArgumentError("no receiver is available");
}