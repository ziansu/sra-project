@java.lang.Override
protected java.lang.Object executeTransform(final java.lang.Object input) {
    context.setVariable("input", input);
    block.execute();
    return input;
}