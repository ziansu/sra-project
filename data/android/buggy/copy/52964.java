public edu.utsa.fileflow.filestructure.FileStructure merge(edu.utsa.fileflow.filestructure.FileStructure source) {
    return mergeImpl(source.clone());
}