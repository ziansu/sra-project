public void OnLoad() {
    java.lang.System.out.println("into onload****************************");
    oracle.binding.OperationBinding createInsertOP = com.view.beans.ADFUtils.findOperation("CreateInsert1");
    createInsertOP.execute();
    java.lang.System.out.println("into onload#####");
}