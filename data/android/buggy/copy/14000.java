public java.util.Map<K, V> pop() {
    if ((this.stackList.size()) > 1) {
        return stackList.remove(0);
    }else {
        return null;
    }
}