@java.lang.Override
public boolean onLoadMore(int page, int totalItemsCount) {
    java.lang.System.out.println((page - 1));
    bwRest.getRestClient((page - 1), "load");
    return true;
}