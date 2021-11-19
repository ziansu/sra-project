@java.lang.Override
public void updateProductionScore(int round) {
    java.util.List<com.cidic.design.model.ScoreBean> list = reviewDaoImpl.getAllReviewResult();
    for (com.cidic.design.model.ScoreBean scoreBean : list) {
        productionDaoImpl.updateProductionScore(scoreBean.getProductionId(), scoreBean.getAverageScore(), round);
    }
}