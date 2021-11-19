public static com.vn.ael.enums.StatusType fromValue(java.lang.String value) {
    for (com.vn.ael.enums.StatusType servicesType : com.vn.ael.enums.StatusType.values()) {
        if (servicesType.getValue().equals(value)) {
            return servicesType;
        }
    }
    return null;
}