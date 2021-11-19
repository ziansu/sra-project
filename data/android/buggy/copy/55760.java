private boolean inSameFile(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.descriptors.DeclarationDescriptor what, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.descriptors.DeclarationDescriptor from) {
    org.jetbrains.kotlin.descriptors.SourceFile fromContainingFile = org.jetbrains.kotlin.resolve.DescriptorUtils.getContainingSourceFile(from);
    if (fromContainingFile != (SourceFile.NO_SOURCE_FILE)) {
        return fromContainingFile.equals(org.jetbrains.kotlin.resolve.DescriptorUtils.getContainingSourceFile(what));
    }
    return false;
}