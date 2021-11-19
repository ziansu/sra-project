private java.lang.ClassLoader initClassLoader(java.util.Properties properties) {
    org.orienteer.core.boot.loader.OrienteerClassLoader.create(org.orienteer.core.OrienteerFilter.class.getClassLoader());
    org.orienteer.core.boot.loader.OrienteerClassLoader.enable();
    org.orienteer.core.boot.loader.OrienteerClassLoader.reindex();
    return org.orienteer.core.boot.loader.OrienteerClassLoader.getClassLoader();
}