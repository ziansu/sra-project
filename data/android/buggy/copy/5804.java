private static java.lang.String formatFromLine(java.util.List<org.jruby.truffle.runtime.backtrace.Activation> activations, int n) {
    return "\tfrom " + (org.jruby.truffle.runtime.backtrace.MRIBacktraceFormatter.formatCallerLine(activations, n));
}