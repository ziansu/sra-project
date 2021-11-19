private void requirePackageFor(java.lang.String name) {
    int idx = name.lastIndexOf(".");
    if (idx != (-1))
        imports.add(name.substring(0, idx));
    
}