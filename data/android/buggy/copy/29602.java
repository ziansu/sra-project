private static org.eclipse.cdt.core.dom.ast.IType resolveUnknownType(org.eclipse.cdt.internal.core.dom.parser.cpp.ICPPUnknownType type, org.eclipse.cdt.core.dom.ast.IASTNode point) {
    return org.eclipse.cdt.internal.core.dom.parser.cpp.semantics.HeuristicResolver.resolveUnknownType(type, point, SemanticUtil.TDEF);
}