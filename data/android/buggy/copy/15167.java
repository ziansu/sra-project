public void startComputing(java.lang.String expression) {
    this.evaluator.setExpression(expression);
    if (this.isExpressionValid) {
        this.gui.setOutputField(this.evaluator.compute());
    }
}