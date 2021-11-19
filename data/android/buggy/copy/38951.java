private void setTheme() {
    setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.oval_filled, getContext().getTheme()));
    setTextColor(de.azapps.material_elements.utils.ThemeManager.getColor(R.attr.colorTextBlack));
}