public void reDeclVar2() throws java.io.IOException {
    typecheck(("autoaddedoutputvar: output sum of int;autoaddedoutputvar << 1;" + (load(((boa.test.compiler.TestTypecheckBad.badDir) + "re-decl-var2.boa")))), "variable 'i' already declared as 'int'");
}