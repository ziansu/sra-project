void emitLogMethodEntry() {
    super.visitCode();
    super.visitLabel(this.beginOutermostHandler);
    dyco4j.instrumentation.LoggingHelper.emitLogMethodEntry(this.mv, this.methodId);
}