protected void setDefaultSelectorOrder() {
    setSelectorOrder(((((timelineType.ordinal()) + 1) * 2) + (isCombined ? 1 : 0)));
}