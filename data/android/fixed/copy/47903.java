@java.lang.Override
public wytp.proof.Formula extract(wyal.lang.WyalFile.Type type, wyal.lang.WyalFile.Expr root) throws wyal.lang.NameResolver.ResolutionError {
    return extractTypeInvariant(type, root, new java.util.HashSet());
}