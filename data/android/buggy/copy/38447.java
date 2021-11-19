public static boolean ask(int windowNo, org.zkoss.zk.ui.Component comp, java.lang.String adMessage) {
    org.adempiere.webui.window.FDialog.ask(windowNo, comp, adMessage, null);
    return true;
}