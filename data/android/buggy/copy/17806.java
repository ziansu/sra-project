public static com.vn.ael.enums.StatusType fromValue(int value) {
    for (com.vn.ael.enums.StatusType servicesType : com.vn.ael.enums.StatusType.values()) {
        if ((servicesType.getValue()) == value) {
            return servicesType;
        }
    }
    return null;
}