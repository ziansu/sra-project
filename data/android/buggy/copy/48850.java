@java.lang.Override
public void setUnselected() {
    setTextColor(android.support.v4.content.ContextCompat.getColor(getContext(), unselected_color));
    if ((unselected_image) != 0)
        setCompoundDrawablesWithIntrinsicBounds(null, android.support.v4.content.ContextCompat.getDrawable(getContext(), unselected_color), null, null);
    
}