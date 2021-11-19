public boolean validation() {
    if (txt.getText().toString().equals("")) {
        {
            printMsg("Name is required");
            return false;
        }
        return true;
    }
}