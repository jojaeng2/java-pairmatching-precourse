package pairmatching.enums;

public enum FileUrl {
    FRONT("src/main/resources/frontend-crew.md"),
    BACK("src/main/resources/backend-crew.md");

    private final String url;

    FileUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
