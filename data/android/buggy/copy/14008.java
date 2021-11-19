@java.lang.Override
public ca.antonious.viewcelladapter.viewcells.AbstractViewCell get(int position) {
    if (position == (getDecoratedSection().getItemCount())) {
        return footerViewCell;
    }
    return getDecoratedSection().get(0);
}