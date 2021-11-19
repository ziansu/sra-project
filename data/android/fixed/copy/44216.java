@javax.ws.rs.GET
@javax.ws.rs.Path(value = "front/goodCommentList/{goodId}")
public java.util.List<com.bit.ss.model.GoodComment> getCommentListByGood(@javax.ws.rs.PathParam(value = "goodId")
int goodId, @javax.ws.rs.QueryParam(value = "page")
int page) {
    java.util.List<com.bit.ss.model.GoodComment> result = goodService.getCommentListByGood(goodId, page);
    return result;
}