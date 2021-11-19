public void changeParamObject(java.lang.Integer testID) {
    insynctive.model.Test test = ((insynctive.model.Test) (insynctive.utils.HibernateUtil.get(insynctive.model.Test.class, testID, getCurrentSession())));
    paramObject = test.getParamObject();
}