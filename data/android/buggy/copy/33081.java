private boolean noCarIsComing(courier.ExpressCentre to, courier.ExpressCentre from) {
    for (courier.Car c : from.carPark) {
        if ((c.stationTo) != null)
            if (c.stationTo.equals(to))
                return false;
            
        
    }
    return true;
}