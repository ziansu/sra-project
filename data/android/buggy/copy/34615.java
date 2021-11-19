@java.lang.Override
public de.meta.functions.FunctionPart derivative(java.lang.String var) {
    return new de.meta.functions.functs.basic.Addition(getPart(0).derivative(var), getPart(0).derivative(var));
}