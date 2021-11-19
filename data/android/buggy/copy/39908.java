public void setDiscreteValuesLabel(org.openflexo.connie.DataBinding<java.lang.String> labelBinding) {
    this.labelBinding = labelBinding;
    this.labelBinding.setOwner(this);
    this.labelBinding.setDeclaredType(java.lang.String.class);
    this.labelBinding.setBindingDefinitionType(BindingDefinitionType.GET);
}