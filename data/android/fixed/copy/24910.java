@com.phg.dhtmonitor.controller.RequestMapping(value = "/readings/count/{count}", method = RequestMethod.GET)
public java.util.ArrayList<com.phg.dhtmonitor.controller.Dht> dhtReadings(@com.phg.dhtmonitor.controller.PathVariable
int count) {
    java.util.ArrayList<com.phg.dhtmonitor.controller.Dht> dhts = dhtService.getLastByCount(count);
    return dhts;
}