@java.lang.Override
public int getChildrenCount(int groupPosition) {
    java.util.List<tda367.myapplication.DetailInfo> productList = deptList.get(groupPosition).getProductList();
    return productList.size();
}