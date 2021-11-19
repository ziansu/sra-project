public void setSupportCarouselIndicatorTap(boolean supportCarouselIndicatorTap) {
    if (supportCarouselIndicatorTap != (this.supportCarouselIndicatorTap)) {
        this.supportCarouselIndicatorTap = supportCarouselIndicatorTap;
        carouselIndicatorContainer.setHandleTapEvent(supportCarouselIndicatorTap);
    }
}