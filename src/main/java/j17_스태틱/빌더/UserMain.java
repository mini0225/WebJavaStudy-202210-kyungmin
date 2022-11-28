package j17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .email("light-min@naver.com")
                .username("min")
                .build();//userBuilder 생성

        System.out.println(user);

        User2 user2 = User2.builder()
                .name("kyoungmin")
                .build();

        System.out.println(user2);

        System.out.println(("user2 → user 로 변경"));

        User u = user2.to();
        System.out.println(u);
    }

}
