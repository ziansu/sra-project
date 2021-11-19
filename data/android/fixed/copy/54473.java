@org.jetbrains.annotations.NotNull
protected org.jetbrains.kotlin.codegen.CallGenerator getOrCreateCallGeneratorForDefaultImplBody(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.codegen.FunctionDescriptor descriptor, @org.jetbrains.annotations.Nullable
org.jetbrains.kotlin.codegen.KtNamedFunction function) {
    return getOrCreateCallGenerator(descriptor, function, null, true);
}