public static java.lang.Object getValue(java.lang.String expression, ognl.OgnlContext context, java.lang.Object root) {
    try {
        return ognl.Ognl.getValue(com.skin.ayada.ognl.util.OgnlUtil.compile(expression), context, root);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}