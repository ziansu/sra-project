public void setSurvivalGuide(org.esn.mobilit.models.SurvivalGuide survivalGuide) {
    android.util.Log.d(org.esn.mobilit.fragments.MyFragmentPagerAdapter.class.getSimpleName(), ("SurvivalGuide categories count : " + (survivalGuide.getCategories().size())));
    this.survivalGuide = survivalGuide;
}