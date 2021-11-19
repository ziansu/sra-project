@java.lang.SuppressWarnings(value = "null")
@org.eclipse.jdt.annotation.NonNull
public com.google.common.base.Optional<org.eclipse.emf.ecore.EObject> getEFactoryEObject(org.eclipse.emf.eson.eFactory.NewObject nObject) throws org.eclipse.emf.eson.building.ModelBuilderException {
    org.eclipse.emf.eson.building.ModelBuilder _builder = getBuilder();
    if (_builder.isBuilt())
        return com.google.common.base.Optional.of(_builder.getBuilt(nObject));
    else
        return com.google.common.base.Optional.absent();
    
}