@java.lang.Override
public org.dei.perla.lang.query.expression.Expression compile(org.dei.perla.lang.parser.ParserContext ctx, java.util.Map<java.lang.String, java.lang.Integer> atts) {
    return org.dei.perla.lang.query.expression.Constant.create(value, type.toDataType());
}