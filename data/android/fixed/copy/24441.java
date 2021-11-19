public java.io.File getBundle(org.apache.zeppelin.helium.HeliumPackage pkg, boolean rebuild) throws java.io.IOException {
    return bundleFactory.buildPackage(pkg, rebuild, true);
}