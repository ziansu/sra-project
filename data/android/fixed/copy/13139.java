@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (!(Upload.uploadGridList.contains(vn.mbm.phimp.me.gallery.PhimpMeGallery.filePath.get(vn.mbm.phimp.me.gallery.PhimpMeGallery.position))))
        Upload.uploadGridList.add(vn.mbm.phimp.me.gallery.PhimpMeGallery.filePath.get(vn.mbm.phimp.me.gallery.PhimpMeGallery.position));
    
}