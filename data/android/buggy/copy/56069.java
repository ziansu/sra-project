private void doRemoveNetwork(cn.academy.energy.internal.WirelessNet net) {
    debug(("DoRemoveNet" + (net.ssid)));
    netList.remove(net);
    net.onCleanup(this);
}