public wblut.hemesh.HE_Mesh modifySelected(final wblut.hemesh.HEM_Modifier modifier, final wblut.hemesh.HE_Selection selection) {
    return modifier.apply(selection.get());
}