@java.lang.Override
public void onTagSelected(prada.lab.android.pingo.model.Tag tag, boolean selected) {
    mRootVm.find(tag.getType()).updateTagState(tag, selected);
}