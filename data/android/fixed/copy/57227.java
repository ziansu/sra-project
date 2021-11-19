public void setNext(iad1.hashtable.MathijsHashTable<K, V>.HashEntry<K, V> next) {
    if (null == (this.next))
        this.next = next;
    else
        this.next.setNext(next);
    
}