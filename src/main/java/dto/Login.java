package dto;

public class Login {
    private String uuid, username, password, salt, md5, sha1, sha256;

    public Login(Builder builder){
        this.uuid = builder.uuid;
        this.username = builder.username;
        this.password = builder.password;
        this.salt = builder.salt;
        this.md5 = builder.md5;
        this.sha1 = builder.sha1;
        this.sha256 = builder.sha256;
    }

    public String getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public String getMd5() {
        return md5;
    }

    public String getSha1() {
        return sha1;
    }

    public String getSha256() {
        return sha256;
    }

    public static class Builder{
        private String uuid, username, password, salt, md5, sha1, sha256;

        public Builder setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setSalt(String salt) {
            this.salt = salt;
            return this;
        }

        public Builder setMd5(String md5) {
            this.md5 = md5;
            return this;
        }

        public Builder setSha1(String sha1) {
            this.sha1 = sha1;
            return this;
        }

        public Builder setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }

        public Login build(){
            return new Login(this);
        }
    }
}
