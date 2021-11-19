@org.springframework.web.bind.annotation.RequestMapping(value = { "/reservation/getByDate" , "/adm/reservation/getByDate" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<com.n8ify.roomrsv.model.RoomUsage> getAvailableReservationByDate(@org.springframework.web.bind.annotation.RequestParam(value = "date", defaultValue = "today")
java.sql.Date date) {
    com.n8ify.roomrsv.controller.ReservationRESTController.logger.info(date.toString());
    com.n8ify.roomrsv.controller.ReservationRESTController.logger.info(rsvMng.findByDate(date).toString());
    return rsvMng.findByDate(date);
}