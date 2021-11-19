@java.lang.Override
public void unloaded(java.lang.String nsURI, org.eclipse.emf.ecore.EPackage pak) {
    queryEnvironment.removeEPackage(pak.getName());
}