@java.lang.Override
public boolean isAuthenticated(boolean authResult, java.lang.String authCookie) {
    this.authCookie = authCookie;
    java.lang.String graphQlQuery = "query{album(id:\"YWxidW06YTczOGUxODctNWY1MC00NmNiLTllZjUtMDgyZTYxMGFhYWY4\"){id,name,photos{records{id, urls{size_code, url}}}}}";
    if (authResult)
        mNetworkRequester.getAlbum(graphQlQuery, this, authCookie);
    
    return authResult;
}