@java.lang.Override
public void cleanup(dyvil.tools.compiler.ast.context.IContext context, dyvil.tools.compiler.ast.structure.IClassCompilableList compilableList) {
    compilableList.addCompilable(this);
    if (dyvil.tools.compiler.ast.reference.StaticFieldReference.addToMap(this.className, this.field)) {
        this.isUnique = true;
    }
}