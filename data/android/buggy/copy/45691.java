@java.lang.Override
public void removeCurrentDocument() {
    if (tabs.contains(currentDocument)) {
        tabs.remove(currentDocument);
        if (tabs.isEmpty())
            currentDocument = null;
        
        setChanged();
        notifyObservers();
    }
}