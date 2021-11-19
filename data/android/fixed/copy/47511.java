public void updateHrs(int hours) {
    if (hours < 10)
        hr_field.setText(("0" + hours));
    else
        hr_field.setText(java.lang.Integer.toString(hours));
    
}