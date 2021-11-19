@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    com.rocdev.guardianreader.models.Section section = sectionsList.get(i);
    mListener.onSectionClicked(section);
}