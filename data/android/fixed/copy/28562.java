public void initializeNetwork() {
    try {
        backPropagationNetwork.initialize();
    } catch (be.kdg.ai.backpropagation.model.InitialisationException e) {
        be.kdg.ai.backpropagation.controller.ViewController.logger.error(e);
    }
}