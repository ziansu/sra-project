public void initializeNetwork(java.lang.Double learningRate, java.lang.Double threshhold) {
    try {
        backPropagationNetwork.initialize(learningRate, threshhold);
    } catch (be.kdg.ai.backpropagation.model.InitialisationException e) {
        be.kdg.ai.backpropagation.controller.ViewController.logger.error(e);
    }
}