@java.lang.Override
public int size() {
    return sourceLists.stream().mapToInt(javafx.collections.ObservableList::size).sum();
}