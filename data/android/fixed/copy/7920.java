private boolean checkVisibility(@javax.annotation.Nonnull
final edu.umd.cs.findbugs.ba.XMethod bcelMethod) {
    return !(((bcelMethod.isPrivate()) || (bcelMethod.isProtected())) || (bcelMethod.isPublic()));
}