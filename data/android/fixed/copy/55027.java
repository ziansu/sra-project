@java.lang.Override
public void flushCache() {
    com.zimbra.cs.ephemeral.migrate.AttributeMigration.clearConfigCacheOnAllServers(true, false);
}