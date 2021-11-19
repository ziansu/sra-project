public static java.util.List<jmri.util.JmriJFrame> getFrameList() {
    java.util.List<jmri.util.JmriJFrame> returnList;
    synchronized(jmri.util.JmriJFrame.list) {
        returnList = new java.util.ArrayList<jmri.util.JmriJFrame>(jmri.util.JmriJFrame.list);
    }
    return returnList;
}