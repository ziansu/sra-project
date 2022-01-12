public static org.jebtk.math.matrix.AnnotationMatrix parseDynamicMatrix(java.nio.file.Path file, java.util.List<java.lang.String> skipMatches, int rowAnnotations, java.lang.String delimiter) throws java.io.IOException {
    return new org.jebtk.math.matrix.DynamicMatrixParser(skipMatches, rowAnnotations, delimiter).parse(file);
}