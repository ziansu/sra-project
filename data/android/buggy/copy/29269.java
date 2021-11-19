private final java.lang.String buildTitle() {
    final xyz.algogo.core.Algorithm algorithm = getAlgorithm();
    return buildTitle(algorithm.getTitle(), algorithm.getAuthor());
}