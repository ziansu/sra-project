@java.lang.Override
public void onResume() {
    super.onResume();
    de.dreier.mytargets.managers.dao.DistanceDataSource dataSource = new de.dreier.mytargets.managers.dao.DistanceDataSource();
    setList(binding.recyclerView, dataSource.getAll(distance, unit), new de.dreier.mytargets.fragments.DistanceGridFragment.DistanceAdapter(getContext()));
}