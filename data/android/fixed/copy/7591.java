public final int[] get() throws com.invertor.modbus.exception.IllegalDataValueException {
    if (((size()) > 31) || ((size()) == 0)) {
        throw new com.invertor.modbus.exception.IllegalDataValueException();
    }
    return peekImpl();
}