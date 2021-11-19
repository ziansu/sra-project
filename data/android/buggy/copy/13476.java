@java.lang.Override
public void check(dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.compiler.ast.context.IContext context) {
    if (!(this.getType().isResolved())) {
        markers.add(dyvil.tools.compiler.util.Markers.semanticError(this.getPosition(), "wildcard.type.unresolved"));
    }
}