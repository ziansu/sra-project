public int createAccessAttribute(org.eclipse.objectteams.otdt.internal.core.compiler.model.RoleModel roleModel) {
    return roleModel.addAccessedBaseField(this.resolvedField, this.calloutModifier);
}