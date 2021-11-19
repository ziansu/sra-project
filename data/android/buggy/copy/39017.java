public com.github.bijoysingh.starter.recyclerview.RVBuilder setOnScrollListener(com.github.bijoysingh.starter.recyclerview.RVBuilder.OnScrollListener scrollListener) {
    if ((layoutManager) == null) {
        setLinear();
    }
    onScrollListener = scrollListener;
}