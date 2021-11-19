private boolean isResult(act.controller.bytecode.Type type) {
    return act.controller.bytecode.ResultClassLookup.isResult(type.getClassName());
}