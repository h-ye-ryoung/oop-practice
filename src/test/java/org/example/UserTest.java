package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {

        //given : User 객체가 주어짐
        User user = new User();

        //when : 이 메소드를 호출했을 때
        user.initPassword(new CorrectFixedPasswordGenerator());

        //then : 결과가 not null일 것이다
        assertThat(user.getPassword()).isNotNull();

        //-> (랜덤으로 만들어진) 8~12자를 만족하는 패스워드는 이 테스트를 pass, 아니면 fail
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {

        //given : User 객체가 주어짐
        User user = new User();

        //when : 이 메소드를 호출했을 때
        user.initPassword(new WrongFixedPasswordGenerator());

        //then : 결과가 not null일 것이다
        assertThat(user.getPassword()).isNull();

        //-> (랜덤으로 만들어진) 8~12자를 만족하는 패스워드는 이 테스트를 pass, 아니면 fail
    }
}