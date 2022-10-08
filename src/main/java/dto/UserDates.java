package dto;

public class UserDates {
    private String date, age;

    public UserDates(Builder builder) {
        this.date = builder.date;
        this.age = builder.age;
    }

    public String getDate() {
        return date;
    }

    public String getAge() {
        return age;
    }

    public static class Builder{
        private String date, age;

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public UserDates build(){
            return new UserDates(this);
        }
    }
}
