private void addEvent(hu.unideb.hospitalnet.vo.TimeTableVo timeTableVo) {
    hu.unideb.hospitalnet.web.worker.model.TimeTableEvent event = new hu.unideb.hospitalnet.web.worker.model.TimeTableEvent();
    event.setTt(timeTableVo);
    addEvent(event);
}