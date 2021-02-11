package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    //JpaRepository를 상속하면 기본 CRUD 메소드가 자동 생성된다.
}
