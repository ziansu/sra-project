@java.lang.Override
public void checkTypes(dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.compiler.ast.context.IContext context) {
    this.type.checkType(markers, context, TypePosition.TYPE);
    if ((this.value) != null) {
        this.value.checkTypes(markers, context);
    }
}