public android.support.v4.app.Fragment getFragment(ir.rasen.charsoo.view.fragment.search.FragmentSearch.SearchType searchType) {
    switch (searchType) {
        case PRODUCTS :
            return fragmentSearchProduct;
        case BUSINESSES :
            return fragmentSearchBusiness;
        case USERS :
            return fragmentSearchUser;
        default :
            return null;
    }
}