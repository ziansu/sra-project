public geogebra.common.util.LaTeXCache getLaTeXCache() {
    if ((latexCache) == null) {
        latexCache = LaTeXFactory.prototype.newLaTeXCache();
    }
    return latexCache;
}