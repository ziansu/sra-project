@com.oracle.truffle.api.dsl.Specialization
public org.jruby.truffle.runtime.core.RubyString toS(org.jruby.truffle.runtime.core.RubyBignum value) {
    return getContext().makeString(value.toString());
}