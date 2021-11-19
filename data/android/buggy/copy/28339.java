@java.lang.Override
public io.ebean.ext.ExtExpressionList<T> endOr() {
    defaultExpressionList = ((io.ebeaninternal.server.expression.DefaultExpressionList<T>) (defaultExpressionList.endOr()));
    return this;
}