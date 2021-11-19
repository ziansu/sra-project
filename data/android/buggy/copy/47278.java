protected org.codelibs.fess.suggest.normalizer.Normalizer createDefaultNormalizer() {
    org.codelibs.fess.suggest.normalizer.NormalizerChain normalizerChain = new org.codelibs.fess.suggest.normalizer.NormalizerChain();
    normalizerChain.add(new org.codelibs.fess.suggest.normalizer.FullWidthToHalfWidthAlphabetNormalizer());
    normalizerChain.add(new org.codelibs.fess.suggest.normalizer.ICUNormalizer("Any-Lower"));
    return new org.codelibs.fess.suggest.normalizer.NormalizerChain();
}