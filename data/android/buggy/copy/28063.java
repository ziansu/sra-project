public static java.util.List<net.spaceboats.busbus.android.Entites.Entity> queryArrivals() {
    if (net.spaceboats.busbus.android.DbHelper.EntityDbDelegator.sDbUpdated)
        net.spaceboats.busbus.android.DbHelper.EntityDbDelegator.sArrivals = net.spaceboats.busbus.android.DbHelper.EntityDbDelegator.sArrivalDbOperator.query();
    
    return net.spaceboats.busbus.android.DbHelper.EntityDbDelegator.sArrivals;
}