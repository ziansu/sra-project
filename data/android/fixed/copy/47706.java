@com.safframework.aop.annotation.Trace
private void useCV4j() {
    com.cv4j.core.spatial.conv.GaussianBlurFilter filter = new com.cv4j.core.spatial.conv.GaussianBlurFilter();
    filter.setSigma(10);
    com.cv4j.rxjava.RxImageData.bitmap(bitmap).addFilter(filter).into(image2);
}