package j17_스태틱.빌더;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String username;
    private String password;
    private String email;
    private String name;

//    public User(String username){
//        this.username = username;
//    }
//
//    public User(String email){
//        this.email = email;
//    }

//    private User(UserBuilder userBuilder){ //노필요
//        this.username = userBuilder.username;
//        this.password = userBuilder.password;
//        this.email = userBuilder.email;
//        this.name = userBuilder.name;
//
//    }

    public static class UserBuilder {  // class User 안의 class UserBuilder 는 User 안에서 쓸수 있음.
        private String username;
        private String password;
        private String email;
        private String name;

        public UserBuilder username(String username){
            this.username = username;
            return this;
        }
        public UserBuilder password(String password){
            this.password = password;
            return this;
        }
        public UserBuilder email(String email){
            this.email = email;
            return this;
        }
        public UserBuilder name(String name){
            this.name = name;
            return this;
        }


        public User build(){
            return new User(username, password, email, name);
        }

    }

    public static UserBuilder builder(){
        return new UserBuilder();

    }

}
