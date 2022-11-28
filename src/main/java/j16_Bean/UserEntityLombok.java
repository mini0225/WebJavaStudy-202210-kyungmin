package j16_Bean;


import lombok.*;

import java.util.Objects;

/*
    정보를 담는 객체를 Entity Class 라고 한다.

    보통 아래의 순서를 갖는다(아래의 기본세팅)
    맴버변수 선언
    생성자 정의
    Getters and setters 정의
    Equals and HashCode 정의
    toString 정의

 */
//메이븐에서 lombok(library) 다운받으면 @~ 로 다 해결
@NoArgsConstructor  // 기본생성자
@AllArgsConstructor // 전체생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data //위의 주석처리 다 모아줌.

public class UserEntityLombok { //사용자에 대한 개인정보를 받는다  보통 개인정보 private

    private String username;
    private String password;
    private String email;
    private String name;



}
