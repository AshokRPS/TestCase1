package dto;

public class Coordinates {

    private String latitude, longitude;

    private Coordinates(Builder builder) {
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public static class Builder {
        private String latitude, longitude;

        public Builder latitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder longitude(String longitude) {
            this.longitude = longitude;
            return this;
        }

        public Coordinates build() {
            return new Coordinates(this);
        }
    }
}
