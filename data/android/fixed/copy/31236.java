@java.lang.Override
public rx.Completable call(java.lang.Throwable throwable) {
    return rx.Completable.error(new com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException.CANNOT_WRITE_CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR, throwable));
}