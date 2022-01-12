@java.lang.Override
public void fetchFilteredModules(java.util.List<de.fhws.campusapp.entity.Module> modules) {
    allModulesDataset.addAll(modules);
    filteredModulesDataset.addAll(modules);
    filter(de.fhws.campusapp.adapter.ModuleListAdapter.oldSearchTerm);
    activateProgressBar.showProgressBar(false);
}