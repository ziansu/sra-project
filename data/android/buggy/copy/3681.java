@java.lang.Override
public gps.api.GPSState evalRule(gps.api.GPSState state) throws exception.NotAppliableException {
    gps.api.GPSState ans = null;
    ans = ((eightqueens.BoardState) (state)).placeQueen(i, j);
    return ans;
}