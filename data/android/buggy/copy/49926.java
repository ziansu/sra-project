public void createKelas(java.lang.String namaKelas) {
    (this.listKelas)++;
    tubes.kelas k = new tubes.kelas(namaKelas);
    this.daftarkelas[listKelas] = k;
}