@java.lang.Override
public void onEnable() {
    me.camdenorrb.katpermissions.KPermissions.instance = this;
    saveDefaultConfig();
    initRedis();
    me.camdenorrb.katpermissions.CatJokes.hackYourComputerAndTakeYourPersonalInformation();
}