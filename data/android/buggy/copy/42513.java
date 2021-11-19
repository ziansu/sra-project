void resort(zemfi.de.vertaktoid.Movement movement, zemfi.de.vertaktoid.Page page) {
    movement.sortMeasures();
    movement.calculateSequenceNumbers();
    page.sortMeasures();
}