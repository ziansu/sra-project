public boolean add(ScheduleElement e) {
    if (!(this.checkOverload(false, e))) {
        this.elements.add(e);
        return true;
    }else {
        return false;
    }
}