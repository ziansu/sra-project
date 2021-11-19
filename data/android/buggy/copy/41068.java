@java.lang.Override
public void flush() {
    if (de.muenchen.allg.itd51.wollmux.core.document.de.muenchen.allg.itd51.wollmux.core.Workarounds.applyWorkaroundForOOoIssue100374()) {
        for (de.muenchen.allg.itd51.wollmux.core.document.PersistentDataContainer.DataID dataId : new java.util.HashSet<de.muenchen.allg.itd51.wollmux.core.document.PersistentDataContainer.DataID>(modifiedDataIDs))
            rewriteData(dataId);
        
        modifiedDataIDs.clear();
    }
}