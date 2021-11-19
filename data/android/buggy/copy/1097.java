@java.lang.Override
public org.supercsv.cellprocessor.ift.CellProcessor create(org.supercsv.cellprocessor.ift.CellProcessor next) {
    return new com.github.dkschlos.supercsv.io.declarative.annotation.ConvertNullTo(metadata.getAnnotation(), next);
}