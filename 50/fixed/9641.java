@java.lang.Override
public long length() throws java.io.IOException {
    return max(((fileendpos) + 1), initfilelen);
}