public void createGroup(java.lang.String gName) {
    handler.send(de.jattyv.jcapi.util.Packer.packCreateGroup(gName, handler.getUser().getLogKey()));
}