public void removeWeblog(com.hkstlr.reeler.weblogger.weblogs.entities.Weblog weblog) throws com.hkstlr.reeler.app.control.WebloggerException {
    this.removeWeblogContents(weblog);
    this.em.remove(weblog);
}