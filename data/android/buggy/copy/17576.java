public void displayDeletedRecordMessage(int result) {
    if (result == 1) {
        java.lang.System.out.println((result + " record deleted sucessfully"));
    }else {
        java.lang.System.out.println("\nError while attempting to delete record!");
    }
}