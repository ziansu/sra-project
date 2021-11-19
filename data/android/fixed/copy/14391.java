public org.springframework.format.Printer<?> getPrinter(org.springframework.samples.mvc.convert.MaskFormat annotation) {
    return new org.springframework.samples.mvc.convert.MaskFormatAnnotationFormatterFactory.MaskFormatter(annotation.value());
}