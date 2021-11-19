private io.ray.hexis.QuadrantFragment getSpecificFragment(int quadrantId) {
    io.ray.hexis.QuadrantFragmentPagerAdapter adapter = ((io.ray.hexis.QuadrantFragmentPagerAdapter) (pager.getAdapter()));
    return ((io.ray.hexis.QuadrantFragment) (adapter.getItem(quadrantId)));
}