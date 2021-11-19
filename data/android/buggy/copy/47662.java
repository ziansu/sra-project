public static boolean isItemAircraft(int id) {
    int result = java.util.Arrays.binarySearch(com.antest1.kcanotify.KcaApiData.T2LIST_AIRCRAFTS, id);
    if (result > 0)
        return true;
    else
        return false;
    
}