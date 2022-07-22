package com.jsik.book.springboot.web.dto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtdTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto =  new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);      //검증 메소드. 검증하고싶은 대상을 메소드 인자로 받음
        assertThat(dto.getAmount()).isEqualTo(amount);  //동등 비교 메소드
    }
}
