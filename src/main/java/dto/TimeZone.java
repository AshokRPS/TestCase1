package dto;

public class TimeZone {

    private String offset, description;

    private TimeZone(Builder builder){
        this.offset = builder.offset;
        this.description = builder.description;
    }

    public String getOffset() {
        return offset;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder{
        private String offset, description;

        public Builder setOffset(String offset) {
            this.offset = offset;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public TimeZone build(){
            return new TimeZone(this);
        }
    }
}
