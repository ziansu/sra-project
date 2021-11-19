com.igor040897.moneytrackerpro.API.Item addRepeat(int pos) {
    final com.igor040897.moneytrackerpro.API.Item item = items.get(pos);
    item.id = hashCode();
    return item;
}