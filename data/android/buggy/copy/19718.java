public void setSendTimeout(long sendTimeout) {
    setSendTimeoutExpression(new org.springframework.integration.expression.ValueExpression(sendTimeout));
}