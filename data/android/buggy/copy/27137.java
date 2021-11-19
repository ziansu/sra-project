@java.lang.Override
public it.unibz.inf.ontop.model.impl.Function getUriTemplateForDatatype(java.lang.String type) {
    return getFunction(new it.unibz.inf.ontop.model.impl.URITemplatePredicateImpl(1), getConstantLiteral(type, COL_TYPE.OBJECT));
}