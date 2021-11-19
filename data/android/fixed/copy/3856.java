public void recordSyntheticAccessorIfNeeded(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.codegen.context.CallableMemberDescriptor descriptor, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.BindingContext bindingContext) {
    if ((hasThisDescriptor()) && (java.lang.Boolean.TRUE.equals(bindingContext.get(org.jetbrains.kotlin.resolve.BindingContext.NEED_SYNTHETIC_ACCESSOR, descriptor)))) {
        accessibleDescriptorIfNeeded(descriptor, null, false);
    }
}