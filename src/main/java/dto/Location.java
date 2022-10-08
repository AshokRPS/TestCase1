package dto;

public class Location {
    private Street street;
    private String city, state, country, postcode;
    private Coordinates coordinates;
    private TimeZone timeZone;

    public Location(Builder builder){
        this.street = builder.street;
        this.city = builder.city;
        this.state = builder.state;
        this.country = builder.country;
        this.postcode = builder.postcode;
        this.coordinates = builder.coordinates;
        this.timeZone = builder.timeZone;
    }

    public Street getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPostcode() {
        return postcode;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public static class Builder{
        private Street street;
        private String city, state, country, postcode;
        private Coordinates coordinates;
        private TimeZone timeZone;

        public Builder setStreet(Street street) {
            this.street = street;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setPostcode(String postcode) {
            this.postcode = postcode;
            return this;
        }

        public Builder setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        public Builder setTimeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Location build(){
            return new Location(this);
        }
    }
}
