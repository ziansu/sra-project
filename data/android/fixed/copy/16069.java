public void highlightByLatestKeyword(edu.ntust.csie.se.mdfk.sophiatag.data.Tag tag) {
    if ((this.latestKeywordCache) == null) {
        return ;
    }
    this.highlightAndAddTag(this.latestKeywordCache, tag);
}