@java.lang.Override
public int hashCode() {
    int result = trackName.hashCode();
    result = (31 * result) + (trackDetails.hashCode());
    result = (31 * result) + (epicodusId);
    return result;
}