package dto;

public class Picture {
    private  String large, medium, small;

    public Picture(Builder builder) {
        this.large = builder.large;
        this.medium = builder.medium;
        this.small = builder.small;
    }

    public String getLarge() {
        return large;
    }

    public String getMedium() {
        return medium;
    }

    public String getSmall() {
        return small;
    }

    public static class Builder{
        private  String large, medium, small;


        public Builder setLarge(String large) {
            this.large = large;
            return this;
        }

        public Builder setMedium(String medium) {
            this.medium = medium;
            return this;
        }

        public Builder setSmall(String small) {
            this.small = small;
            return this;
        }

        public Picture build(){
            return new Picture(this);
        }
    }
}
