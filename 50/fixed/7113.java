private void loadRepositoryView(ch.cern.cvmfs.model.RepositoryDescription chosen) {
    new ch.cern.cvmfs.fragments.MainFragment.LoadNewRepository(chosen).execute();
}