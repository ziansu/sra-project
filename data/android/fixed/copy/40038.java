public double drawBill() {
    org.team16.team16week4.Bill.logger.log(java.util.logging.Level.FINE, (("Cost : " + (this.detailedCostObject.getTotalCost())) + "\n"));
    return new java.lang.Double(this.detailedCostObject.getTotalCost());
}