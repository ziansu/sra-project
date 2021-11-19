@dagger.Provides
@javax.inject.Named(value = "androidBluetoothPlatform")
@javax.inject.Singleton
public com.sensorberg.sdk.internal.interfaces.BluetoothPlatform provideAndroidBluetoothPlatform(android.bluetooth.BluetoothAdapter adapter, com.sensorberg.bluetooth.CrashCallBackWrapper wrapper, android.content.Context context) {
    return new com.sensorberg.sdk.internal.AndroidBluetoothPlatform(adapter, wrapper, context);
}