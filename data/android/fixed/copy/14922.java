public void typeCheck(org.overture.typechecker.FlatEnvironment env, org.overture.ast.typechecker.NameScope scope) {
    env.add(org.overture.ast.factory.AstFactoryTC.newALocalDefinition(var.name.getLocation(), var.name, scope, var.type));
}