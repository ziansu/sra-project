public void storeValue(int cellNo, float value) {
    memory[(cellNo / 4)] = value;
    simulator.getGui().updateMemoryCell(cellNo, value);
}