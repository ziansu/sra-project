@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
public static final <U> U convert(java.lang.Object from, org.jooq.Converter<?, ? extends U> converter) throws org.jooq.exception.DataTypeException {
    return ((U) (org.jooq.tools.Convert.convert0(from, ((org.jooq.Converter) (converter)))));
}