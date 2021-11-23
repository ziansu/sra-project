@java.lang.Override
public boolean accept(org.carbondata.core.datastorage.store.filesystem.CarbonFile path) {
    return !(loadFolders.contains(path.getAbsolutePath().replace("\\", "/")));
}