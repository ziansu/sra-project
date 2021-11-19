public rfid.paymentsystem.model.Value getValueById(int valueTagId) {
    for (rfid.paymentsystem.model.Value value : values.values()) {
        if ((value.getId()) == valueTagId) {
            return value;
        }
    }
    return null;
}