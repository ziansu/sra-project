@java.lang.Override
protected java.lang.Void doInBackground() throws java.lang.Exception {
    channel.get_artwork(dimension);
    return null;
}