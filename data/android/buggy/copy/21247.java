public de.plushnikov.intellij.plugin.psi.LombokLightMethodBuilder withParameter(@org.jetbrains.annotations.NotNull
java.lang.String name, @org.jetbrains.annotations.NotNull
com.intellij.psi.PsiType type) {
    addParameter(new de.plushnikov.intellij.plugin.psi.LombokLightParameter(name, type, this, com.intellij.lang.java.JavaLanguage.INSTANCE));
    return this;
}