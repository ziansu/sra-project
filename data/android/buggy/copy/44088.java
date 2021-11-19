@java.lang.Override
public java.lang.String toString(java.lang.Number object) {
    return this.formatter.format(((object.doubleValue()) * (de.bioforscher.singa.features.parameters.EnvironmentalParameters.getInstance().getTimeStep().getValue().doubleValue())));
}