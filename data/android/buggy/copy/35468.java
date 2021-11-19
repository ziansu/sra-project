public static java.util.List<org.eclipse.emf.ecore.EPackage> readEPackages(final java.util.List<java.net.URI> uris, org.eclipse.emf.ecore.EPackage.Registry registry, boolean useWsUris) {
    final org.eclipse.emf.ecore.resource.ResourceSet resourceSet = org.eclipse.emf.texo.generator.GeneratorUtils.createGenerationResourceSet(null, registry);
    return org.eclipse.emf.texo.generator.GeneratorUtils.readEPackages(uris, resourceSet, registry, useWsUris);
}