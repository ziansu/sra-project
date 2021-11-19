private boolean ignoreClass(java.lang.String className) {
    java.lang.System.out.println(className);
    java.lang.System.out.println(ignoredClasses);
    java.lang.System.out.println(this.ignoredClasses.get(className));
    return (this.ignoredClasses.get(className)) != null;
}