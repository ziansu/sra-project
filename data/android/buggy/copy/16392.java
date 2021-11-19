@java.lang.Override
public boolean canUpdate() {
    return !(realmService.isReadOnly(getCurrentRealm()));
}