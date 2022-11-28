package j17_스태틱.빌더;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User2 {

    private String username;
    private String password;
    private String email;
    private String name;

    public User to(){ //user2의 값들이 to 메소드를 통해서 user 개체를 생성한다.
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();

    }

}
