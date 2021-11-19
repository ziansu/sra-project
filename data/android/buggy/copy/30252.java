private static java.lang.String getTypeName(javax.lang.model.element.TypeElement elem) {
    return org.spongepowered.tools.MirrorUtils.getInternalName(elem).replace('/', '.').replace('$', '.');
}