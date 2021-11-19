@java.lang.Override
public boolean isIncomplete() {
    if ((state) == (net.nexustools.njs.compiler.RegexCompiler.Function.State.InLambda))
        return ((storage) == null) || (storage.isIncomplete());
    
    return (state) != (net.nexustools.njs.compiler.RegexCompiler.Function.State.Complete);
}