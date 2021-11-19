private boolean checkVisibility(edu.umd.cs.findbugs.ba.XMethod bcelMethod) {
    return !(((bcelMethod.isPrivate()) || (bcelMethod.isProtected())) || (bcelMethod.isPublic()));
}