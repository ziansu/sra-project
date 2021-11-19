@java.lang.Override
public int compareTo(dw317.hotel.business.interfaces.Reservation reserve) {
    if (this.aRoom.equals(reserve.getRoom()))
        return this.aRoom.compareTo(reserve.getRoom());
    
    return checkIn.compareTo(reserve.getCheckInDate());
}