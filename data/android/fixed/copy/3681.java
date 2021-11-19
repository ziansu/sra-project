@java.lang.Override
public gps.api.GPSState evalRule(gps.api.GPSState state) throws exception.NotAppliableException {
    return ((eightqueens.BoardState) (state)).placeQueen(i, j);
}