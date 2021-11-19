public static void testStartReplicationPolicy() {
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest.setUp();
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest.result = com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._isi.doStartReplicationPolicy(com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest._device, "mudit_policy");
    com.emc.storageos.volumecontroller.impl.isilon.IsilonReplicationTest.result.getCommandStatus();
}