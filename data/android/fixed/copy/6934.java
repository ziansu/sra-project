@java.lang.Override
public void drawOpen(final controller.IController controller) {
    if (!(controller.getDiscardPile().isEmpty())) {
        controller.drawOpenCard();
    }
}