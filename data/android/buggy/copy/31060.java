public java.lang.String makePath(java.lang.String path) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(root);
    sb.append(java.io.File.separatorChar);
    sb.append(path);
    return sb.toString();
}