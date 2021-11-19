public void setSections(java.lang.String sections) {
    putParam("fq", java.lang.String.format("section_name:(%s)", sections));
}