@java.lang.Override
protected java.lang.String getCommonSuperClass(@org.jetbrains.annotations.NotNull
java.lang.String type1, @org.jetbrains.annotations.NotNull
java.lang.String type2) {
    try {
        return super.getCommonSuperClass(type1, type2);
    } catch (java.lang.Throwable t) {
        return "java/lang/Object";
    }
}