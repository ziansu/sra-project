private int lineAsInt(org.jruby.runtime.ThreadContext context, org.jruby.runtime.builtin.IRubyObject line) {
    if ((line == null) || (line.isNil()))
        return 0;
    
    return org.jruby.RubyNumeric.fix2int(line.convertToInteger());
}