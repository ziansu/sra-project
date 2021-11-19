public boolean isObsolete() {
    return (org.xtreemfs.foundation.TimeSync.getGlobalTime()) > (latestExpireTime);
}