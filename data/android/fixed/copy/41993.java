@java.lang.Override
public void responseFinished(java.util.List<com.jonathan.james.eric.project_3.Article> responseList) {
    mManager.beginTransaction().replace(R.id.section_fragment_container, com.jonathan.james.eric.project_3.SectionFragment.getInstance(responseList, 1, this, this)).commit();
}