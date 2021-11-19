@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new com.oblador.vectoricons.VectorIconsPackage(), new com.horcrux.svg.RNSvgPackage(), new com.github.yamill.orientation.OrientationPackage(this));
}