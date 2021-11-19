public gnu.io.CommPortIdentifier tryPorts(gnu.io.CommPortIdentifier[] commPortIdentifiers) {
    for (gnu.io.CommPortIdentifier commPortIdentifier : commPortIdentifiers) {
        if ((connect(commPortIdentifier)) == true) {
            return commPortIdentifier;
        }
    }
    return null;
}