private void runEval(java.util.List<ml.shifu.shifu.container.obj.EvalConfig> evalSetList) throws java.io.IOException {
    for (ml.shifu.shifu.container.obj.EvalConfig evalConfig : evalSetList) {
        runEval(evalConfig);
    }
    ml.shifu.shifu.core.processor.EvalModelProcessor.log.info("Step Finished: eval");
}