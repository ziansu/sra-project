public float compute() {
    return activation.calculate(((getInputValues().dotProduct(weights)) + (bias)));
}