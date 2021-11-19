protected void writePrintStructureToOutputStream(final java.io.OutputStream os, final boolean rebuild) throws java.io.IOException {
    beforeWritePrintStructureToOutputStream();
    recurChildrenToOutputStream(os, new java.util.LinkedHashSet<com.webfirmframework.wffweb.tag.html.AbstractHtml>(java.util.Arrays.asList(this)), true);
}