package dto;

public class Id {
    private String name, value;

    public Id(Builder builder) {
        this.name = builder.name;
        this.value = builder.value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public static class Builder {
        private String name, value;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Id build() {
            return new Id(this);
        }
    }
}
