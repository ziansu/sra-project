@java.lang.Override
public boolean select(org.eclipse.jface.viewers.Viewer viewer, java.lang.Object parentElement, java.lang.Object element) {
    if (element instanceof com.kdmanalytics.toif.ui.common.IFindingEntry) {
        return doesLocationContainTwoSameSFP(((com.kdmanalytics.toif.ui.common.IFindingEntry) (element)));
    }
    return false;
}