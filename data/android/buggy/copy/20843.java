@java.lang.Override
public int hashCode() {
    int result = ((int) ((participant_id) ^ ((participant_id) >>> 32)));
    result = (31 * result) + (isFemale ? 1 : 0);
    return result;
}