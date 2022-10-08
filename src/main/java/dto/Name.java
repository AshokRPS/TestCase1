package dto;

public class Name {
    
    private String title, first, last;

    public Name(Builder builder) {
        this.title = builder.title;
        this.first = builder.first;
        this.last = builder.last;
    }

    public String getTitle() {
        return title;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public static class Builder{
        private String title, first, last;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setFirst(String first) {
            this.first = first;
            return this;
        }

        public Builder setLast(String last) {
            this.last = last;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }
}
