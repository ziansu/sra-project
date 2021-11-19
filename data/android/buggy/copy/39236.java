@java.lang.Override
public void run(java.lang.String[] args) throws java.io.IOException {
    try {
        org.rascalmpl.library.experiments.Compiler.Commands.RascalC.main(java.util.Arrays.copyOfRange(args, 1, args.length));
    } catch (org.rascalmpl.library.experiments.Compiler.RVM.Interpreter.NoSuchRascalFunction | java.net.URISyntaxException e) {
        throw new java.lang.RuntimeException(e);
    }
}