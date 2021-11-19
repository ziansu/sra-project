private boolean mapDerefStatusCode(de.unibonn.iai.eis.diachron.datatypes.StatusCode statusCode) {
    switch (statusCode) {
        case SC303 :
        case HASH :
            return true;
        default :
            return false;
    }
}