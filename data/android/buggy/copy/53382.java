@java.lang.Override
public int getChildrenCount(int groupPosition) {
    java.util.ArrayList<tda367.myapplication.DetailInfo> productList = deptList.get(groupPosition).getProductList();
    return productList.size();
}