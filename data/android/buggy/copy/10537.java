@java.lang.Override
public void onEnable() {
    cloud.swiftnode.ksecurity.util.Static.runTaskAsync(() -> new cloud.swiftnode.ksecurity.module.kvaccine.abstraction.processor.VirusScanProcessor().process());
    StaticStorage.ALLOWED_OP_SET.addAll(cloud.swiftnode.ksecurity.util.Config.getOpList());
}