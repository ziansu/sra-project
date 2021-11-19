private void toggleItems(boolean show) {
    mSpringChain.setControlSpringIndex(0).getControlSpring().setEndValue((show ? 1.0F : 0.0F));
}