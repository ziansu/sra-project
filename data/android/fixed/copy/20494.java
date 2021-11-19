@hugo.weaving.DebugLog
@java.lang.Override
public void onCharacteristicItemClick(int position) {
    fragmentManager.beginTransaction().addToBackStack("detail").replace(R.id.detail_fragment_view, controlFragment, "detail").commit();
    bluetoothGattCharacteristic = bluetoothGattCharacteristics.get(position);
}