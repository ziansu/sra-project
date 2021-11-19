@java.lang.Override
public java.lang.String removeFrequency(java.lang.String _, int freq) {
    if (_ != (cofh.core.RegistryEnderAttuned.dummy)) {
        cofh.core.network.PacketHandler.sendToServer(new cofh.core.RegistryEnderAttuned.Packet(hostedChannel, freq));
    }
    return super.removeFrequency(hostedChannel, freq);
}