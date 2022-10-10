package dto;

import java.util.List;

public class ResponseDto {

    private List<Results> results;
    private Info info;

    public ResponseDto(Builder builder) {
        this.results = builder.results;
        this.info = builder.info;
    }

    public List<Results> getResults() {
        return results;
    }

    public Info getInfo() {
        return info;
    }

    public static class Builder {
        private List<Results> results;
        private Info info;

        public Builder setResults(List<Results> results) {
            this.results = results;
            return this;
        }

        public Builder setInfo(Info info) {
            this.info = info;
            return this;
        }

        public ResponseDto build() {
            return new ResponseDto(this);
        }
    }
}
