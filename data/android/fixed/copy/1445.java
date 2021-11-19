public java.lang.String getStringValue() {
    switch (this) {
        case AILERON :
            return "aileron";
        case ELEVATOR :
            return "elevator";
        case RUDDER :
            return "rudder";
        case THROTTLE :
            return "throttle";
        case CUTOVER :
            return "cutover";
    }
    return null;
}