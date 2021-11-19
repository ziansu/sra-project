public static communication.pdu.TransportPDU createTransportPDU(byte[] data) {
    return new communication.pdu.TransportPDU(new communication.pdu.PDU(data));
}