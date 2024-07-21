package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
public class Memo {
    private String username;
    private  String contents;
}

class Main{
    public static void main(String[] args) {

        // AllArgsConstructor를 사용했기 때문에
        // 모든 필드를 가지는 오버로딩 된 생성자를 만들다 보니깐
        //기본 생성자를 Compile가 넣어 주지 않아서 에러 발생
        //기본 생성자를 넣어주거나 , 기본 생성자를 만드는 NoArgsConstructor생성하면 에러 발생x
        Memo memo = new Memo();
        //@Getter, @Setter를 사용했기 때문에
        //선언하지 않아도 Get,Set사용 가능
        //memo.setUsername("Park");
        System.out.println(memo.getUsername());
    }
}