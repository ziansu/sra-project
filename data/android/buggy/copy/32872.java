@org.junit.Test
public void getViewPagerAdapterShouldHaveTwoFragments() {
    junit.framework.Assert.assertNotNull(activity.getViewPagerAdapter().getItem(0));
    junit.framework.Assert.assertNotNull(activity.getViewPagerAdapter().getItem(1));
}