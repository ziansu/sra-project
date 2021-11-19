@java.lang.Override
public ru.nsu.xsld.parsing.UnresolvedPath append(java.lang.String last) {
    return new ru.nsu.xsld.parsing.UnresolvedPath(this, last);
}