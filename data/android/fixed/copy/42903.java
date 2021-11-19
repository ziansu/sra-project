@java.lang.Override
public void close() throws java.io.IOException {
    if ((snpEffCodingFilter) != null) {
        snpEffCodingFilter.destroy();
    }
}