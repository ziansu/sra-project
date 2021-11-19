protected void injectSizzleIfNeeded(org.tribbloid.spookystuff.selenium.JavascriptExecutor context) {
    if (!(sizzleLoaded(context))) {
        org.tribbloid.spookystuff.selenium.BySizzleCssSelector.injectSizzle(context);
    }
}