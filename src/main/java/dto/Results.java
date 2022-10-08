package dto;

public class Results {

    private String gender, email, phone, cell, nat;
    private Name name;
    private Location location;
    private Login login;
    private UserDates dob;
    private UserDates registered;
    private Id id;
    private Picture picture;

    public Results(Builder builder) {
        this.gender = builder.gender;
        this.email = builder.email;
        this.phone = builder.phone;
        this.cell = builder.cell;
        this.nat = builder.nat;
        this.name = builder.name;
        this.location = builder.location;
        this.login = builder.login;
        this.dob = builder.dob;
        this.registered = builder.registered;
        this.id = builder.id;
        this.picture = builder.picture;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCell() {
        return cell;
    }

    public String getNat() {
        return nat;
    }

    public Name getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public Login getLogin() {
        return login;
    }

    public UserDates getDob() {
        return dob;
    }

    public UserDates getRegistered() {
        return registered;
    }

    public Id getId() {
        return id;
    }

    public Picture getPicture() {
        return picture;
    }

    public static class Builder{
        private String gender, email, phone, cell, nat;
        private Name name;
        private Location location;
        private Login login;
        private UserDates dob;
        private UserDates registered;
        private Id id;
        private Picture picture;

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setemail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setCell(String cell) {
            this.cell = cell;
            return this;
        }

        public Builder setNat(String nat) {
            this.nat = nat;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        public Builder setLogin(Login login) {
            this.login = login;
            return this;
        }

        public Builder setDob(UserDates dob) {
            this.dob = dob;
            return this;
        }

        public Builder setRegistered(UserDates registered) {
            this.registered = registered;
            return this;
        }

        public Builder setId(Id id) {
            this.id = id;
            return this;
        }

        public Builder setPicture(Picture picture) {
            this.picture = picture;
            return this;
        }

        public Results build(){
            return new Results(this);
        }
    }
}
