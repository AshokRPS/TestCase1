package dto;

public class Street {

    private String number, name;

    private Street(Builder builder) {
        this.number = builder.number;
        this.name = builder.name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private String number, name;

        public Builder setNumber(String number) {
            this.number = number;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Street buiuld() {
            return new Street(this);
        }
    }
}
