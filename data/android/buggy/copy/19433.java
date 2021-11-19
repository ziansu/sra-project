public int getTotalPage() {
    return (userMgr.getAllGoods(0, 1000).size()) / (com.ian.onlinemall.controller.GoodsController.pageSize);
}