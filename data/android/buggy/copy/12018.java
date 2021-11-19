public final synchronized void addModule(final org.optimizationBenchmarking.experimentation.evaluation.impl.evaluator.data.ModuleEntry entry) {
    this.fsmStateAssert(BuilderFSM.STATE_OPEN);
    this.fsmFlagsAssertAndUpdate(_ConfigEntryBuilder.FLAG_CONFIG_SET, FSM.FLAG_NOTHING, org.optimizationBenchmarking.experimentation.evaluation.impl.evaluator.data.EvaluationModulesBuilder.FLAG_MODULE_ADDED, FSM.FLAG_NOTHING);
    this.m_entries.add(entry);
}