public static byte[] getOpenCell(short circuit_id, int opener, int opened) {
    return TorCellConverter.OpenCellHelper(circuit_id, TorCellConverter.OPEN_CELL, opener, opened);
}