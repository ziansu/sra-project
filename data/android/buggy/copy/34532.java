public void setLoadNextPage(solutions.alterego.androidbound.android.adapters.PageDescriptor page) {
    if (page != null) {
        createItems(page.getCurrentPage());
    }
}