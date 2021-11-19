@java.lang.Override
public void parentPath(java.lang.String path) {
    this.path = io.femo.http.HttpRoutable.joinPaths(path, this.path);
}