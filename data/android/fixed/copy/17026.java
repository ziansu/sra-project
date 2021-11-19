@java.lang.Override
public void checkTypes(dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.compiler.ast.context.IContext context) {
    if ((this.type) != null) {
        this.type.checkType(markers, context, TypePosition.CLASS);
    }
    this.arguments.checkTypes(markers, context);
}