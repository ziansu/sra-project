void resort(zemfi.de.vertaktoid.Movement movement, zemfi.de.vertaktoid.Page page) {
    if (movement == null) {
        return ;
    }
    movement.sortMeasures();
    movement.calculateSequenceNumbers();
    page.sortMeasures();
}