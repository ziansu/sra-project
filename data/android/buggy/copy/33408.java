public void setContentList(java.util.List<com.example.rizkyfadilah.carmudi.model.ResultModel> listResult, int page) {
    if (page > 1)
        this.listResult.addAll(listResult);
    else
        this.listResult = listResult;
    
    notifyDataSetChanged();
    setLoaded();
}