public static void main(java.lang.String[] args) {
    org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder encoder = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
    java.lang.System.out.println(("encoder: mobile  ------> " + (encoder.encode("mobile"))));
    org.springframework.boot.SpringApplication.run(org.community.CommunityApplication.class, args);
}