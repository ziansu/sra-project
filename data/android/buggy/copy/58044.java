public boolean businessRule3(mt.Order o) {
    if ((o.getNumberOfUnits()) < 10) {
        serverComm.sendError(o.getNickname(), "You can't place an Order with less than 10 units");
        return false;
    }else
        return true;
    
}