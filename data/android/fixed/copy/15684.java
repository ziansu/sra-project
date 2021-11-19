public void establishOutputNeuronError(float target) {
    error = (derivative) * (target - (output));
}