@java.lang.Override
public void create() throws java.io.IOException {
    segment.create(com.orientechnologies.orient.core.storage.impl.local.OStorageConfigurationSegment.START_SIZE);
    super.create();
    final com.orientechnologies.orient.core.storage.fs.OFile f = segment.getFile();
    f.synch();
}