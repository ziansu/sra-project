public void postConcatonateInputs(int numInputsToAdd) {
    modifyNodeInputIndex(0, numInputsToAdd);
    modifyNodeInputIndex(1, numInputsToAdd);
    this.numInputs += numInputsToAdd;
}