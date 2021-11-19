@java.lang.Override
public int compare(org.openflexo.technologyadapter.pdf.model.TextBox.Row o1, org.openflexo.technologyadapter.pdf.model.TextBox.Row o2) {
    double center1 = (o1.bottom) - (o1.top);
    double center2 = (o2.bottom) - (o2.top);
    return center2 < center1 ? 1 : center2 > center1 ? -1 : 0;
}