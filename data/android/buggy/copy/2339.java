private boolean areMatchingTypes(@mockit.internal.util.Nonnull
java.lang.reflect.ParameterizedType declarationType, @mockit.internal.util.Nonnull
java.lang.reflect.ParameterizedType realizationType) {
    if (!(declarationType.getRawType().equals(realizationType.getRawType()))) {
        return false;
    }
    return haveMatchingActualTypeArguments(declarationType, realizationType);
}