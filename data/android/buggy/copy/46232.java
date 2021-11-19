@java.lang.Override
protected void setupUI(android.view.View rootLayout) {
    rootLayout.findViewById(R.id.btnExportForProject).setOnClickListener(this);
    exportFragment = addChild(R.id.frgExportOnTabContainer, new uk.ac.ucl.excites.sapelli.collector.fragments.ExportFragment(getOwner().getCurrentProject(true)));
}