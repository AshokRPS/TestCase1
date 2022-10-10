package dto;

public class Info {


    private String seed, results, page, version;

    public Info(Builder builder) {
        this.seed = builder.seed;
        this.results = builder.results;
        this.page = builder.page;
        this.version = builder.version;
    }

    public String getSeed() {
        return seed;
    }

    public String getResults() {
        return results;
    }

    public String getPage() {
        return page;
    }

    public String getVersion() {
        return version;
    }

    public static class Builder {
        private String seed, results, page, version;

        public Builder setSeed(String seed) {
            this.seed = seed;
            return this;
        }

        public Builder setResults(String results) {
            this.results = results;
            return this;
        }

        public Builder setPage(String page) {
            this.page = page;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Info build() {
            return new Info(this);
        }
    }
}
