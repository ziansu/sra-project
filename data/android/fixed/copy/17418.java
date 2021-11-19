private static void error(@org.jetbrains.annotations.NotNull
java.lang.String message, @org.jetbrains.annotations.NotNull
org.elixir_lang.reference.PsiElement element) {
    org.elixir_lang.errorreport.Logger.error(org.elixir_lang.reference.Callable.class, message, element);
}