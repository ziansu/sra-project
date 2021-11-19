@java.lang.Override
protected com.google.inject.Injector internalCreateInjector() {
    testmodel.impl.TestmodelPackageImpl.init();
    return super.internalCreateInjector();
}