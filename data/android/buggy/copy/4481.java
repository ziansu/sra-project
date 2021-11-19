public void draw(float[] initialMatrix) {
    plane.draw(initialMatrix);
    if ((flight) != null) {
        flight.draw(initialMatrix);
    }
    new uk.ac.aber.gij2.olandroid.view.Aircraft(0).draw(initialMatrix);
}