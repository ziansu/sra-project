public void add(pt.castro.tops.list.LocalItemHolder localItemHolder) {
    synchronized(visibleItems) {
        if (!(visibleItems.contains(localItemHolder))) {
            visibleItems.add(localItemHolder);
            notifyItemInserted(visibleItems.indexOf(localItemHolder));
        }
    }
}