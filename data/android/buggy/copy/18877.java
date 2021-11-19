private void selectItem(int position) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    PopulateDB();
    mDrawerList.setItemChecked(position, true);
    setTitle(mPlanetTitles[position]);
    mDrawerLayout.closeDrawer(mDrawerList);
}