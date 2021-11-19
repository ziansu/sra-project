public static int getFakeFromReal(com.zanlabs.widget.infiniteviewpager.InfiniteViewPager viewPager, int real) {
    int realAdapterSize = (viewPager.getAdapterSize()) / (com.zanlabs.widget.infiniteviewpager.InfiniteViewPager.FakePositionHelper.MULTIPLIER);
    return real % realAdapterSize;
}