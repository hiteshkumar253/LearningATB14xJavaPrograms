package ex_25_ENUM;

enum ENV {
    DEV("https://dev.example.com"),
    STAGING("https://staging.example.com"),
    PROD("https://www.example.com");

    private String url;
    ENV(String url) {
        this.url = url; // assign the url parameter to the url field.
    }
    String getUrl(){
        return this.url;
    }
}