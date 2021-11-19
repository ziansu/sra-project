@java.lang.Override
public void choose_a_position() {
    name.cantanima.idealnim.MainActivity.Bluetooth_Reading_Thread bt_reader = new name.cantanima.idealnim.MainActivity.Bluetooth_Reading_Thread(overall_context, bt_socket, this, true);
    bt_reader.execute();
}