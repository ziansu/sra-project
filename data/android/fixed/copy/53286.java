public dyvil.tools.compiler.ast.expression.access.ClassConstructor toClassConstructor() {
    dyvil.tools.compiler.ast.expression.access.ClassConstructor cc = new dyvil.tools.compiler.ast.expression.access.ClassConstructor(this.position, this.type, this.arguments);
    cc.constructor = this.constructor;
    return cc;
}