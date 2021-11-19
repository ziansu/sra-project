private <T> boolean satisftyMFD(E attribute, T left, T right) {
    return (distance(attribute, left, right)) <= (this.mfd.getDelta());
}