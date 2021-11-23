public void addData(short[] data) {
    if ((dataForDraw) != null) {
        nextStartPoint = addArrayToArray(dataForDraw, data, nextStartPoint);
    }
}