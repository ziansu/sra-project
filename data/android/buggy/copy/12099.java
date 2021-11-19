@java.lang.Override
public int size() {
    return (this.toEnd ? (this.listMap.size()) - 1 : this.toEntry) - (this.fromStart ? 0 : (this.fromEntry) + 1);
}