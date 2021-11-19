public void interact(klondike.controller.NotMoveController controller) {
    controller.accept(this);
    new klondike.view.BoardView(controller).write();
}