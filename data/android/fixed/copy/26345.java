private eic.beike.projectx.busdata.BusData findMatch(eic.beike.projectx.model.UserEvent e) {
    return busCollector.getBusData(e.timeStamp, e.sensor);
}