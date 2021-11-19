@java.lang.Override
public void shiftsChanged() {
    setShifts(bscmail.gui.Application.getShifts());
    for (bscmail.gui.Shift shift : bscmail.gui.Application.getShifts()) {
        getQualifiedVolunteers(shift, bscmail.gui.Application.getVolunteers());
    }
}