public edu.utsa.fileflow.filestructure.FileStruct insert(edu.utsa.fileflow.filestructure.FileStruct fs) {
    fs.parent = this;
    return files.put(fs.name, fs);
}