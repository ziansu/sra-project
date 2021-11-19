@java.lang.Override
public java.lang.Void call() {
    java.lang.System.out.println(("[FINE] SelectMediaPresentation.MediaItemTreeCell.updateItem(...).new Task() {...}.call() - Loading data for: " + item));
    try {
        item.loadData(itemEnricher);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}