public tw.jwzhuang.jtools.HandlerWatcher makeHandler(tw.jwzhuang.jtools.HandlerTask task, int secs, java.lang.String token) {
    return makeWatcher(token).runTask(task, (secs * 1000));
}