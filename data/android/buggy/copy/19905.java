private void init(java.util.List<P> parents) {
    mParents = (parents == null) ? java.util.Collections.<P>emptyList() : parents;
    mItems = com.github.huajianjiang.expandablerecyclerview.widget.ExpandableAdapters.generateItems(parents);
}