public boolean businessRule3(mt.Order o) {
    if ((o.getNumberOfUnits()) < 10) {
        java.lang.System.out.println("You can't place an Order with less than 10 units");
        return false;
    }else
        return true;
    
}