public void run() {
    android.app.Fragment currentFragment = fm.findFragmentByTag(MainActivity.MAP_FRAGMENT_TAG);
    if (currentFragment instanceof lk.steps.breakdownassist.Fragments.GmapFragment) {
        lk.steps.breakdownassist.Fragments.GmapFragment GmapFrag = ((lk.steps.breakdownassist.Fragments.GmapFragment) (currentFragment));
        GmapFrag.FocusBreakdown(BreakdonwList.get(position));
    }
}