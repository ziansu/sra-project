protected void fillFirstPage(final com.commercetools.sunrise.search.pagination.viewmodels.PaginationViewModel viewModel, final io.sphere.sdk.queries.PagedResult<?> pagedResult) {
    if (firstPageIsDisplayed()) {
        viewModel.setFirstPage(createLinkData(1));
    }
}