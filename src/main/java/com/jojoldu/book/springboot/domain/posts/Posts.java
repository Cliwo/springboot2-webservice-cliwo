package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    //Entity 클래스에서는 절대 Setter 메소드를 만들지 않습니다! (92p)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //java native 기능임. 스프링 부트 2.0과 함께 쓸 꼉우 Identity 옵션을 추가해야 auto increment가 된다.
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false) //이거 TEXT가 아니라 TEST 이런거 들어가면 개판남 ㅎㅎ..
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) { //id를 빼고 생성한다. (id는 자동 생성되야 하므로)
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content)
    {
        this.title = title;
        this.content = content;
    }
}
