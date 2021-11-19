@java.lang.Override
public void overrideLayer(int i, org.deeplearning4j.nn.conf.NeuralNetConfiguration.Builder builder) {
    builder.activationFunction("softmax");
    builder.layerFactory(org.deeplearning4j.nn.layers.factory.LayerFactories.getFactory(org.deeplearning4j.nn.layers.OutputLayer.class));
    builder.lossFunction(LossFunctions.LossFunction.MCXENT);
}