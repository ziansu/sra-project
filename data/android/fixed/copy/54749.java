@java.lang.Override
public void apply(springfox.documentation.spi.schema.contexts.ModelPropertyContext context) {
    com.google.common.base.Optional<javax.validation.constraints.NotNull> notNull = extractAnnotation(context);
    if (notNull.isPresent()) {
        context.getBuilder().required(notNull.isPresent());
    }
}