public java.lang.String judge(java.lang.String str) {
    switch (str) {
        case "sum" :
            return "		long ";
        case "integer" :
            return "		int ";
        case "character varying" :
            return "		String ";
        case "character" :
            return "		char ";
        default :
            return "		int ";
    }
}