package org.ohgiraffers.transactional.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/* 설명. @Mapper 어노테이션을 적용한 인터페이스를 매퍼로 등록하기 위해서는 @MapperScan을 적용해야 한다. */
@Configuration
@MapperScan(basePackages = "org.ohgiraffers.transactional", annotationClass = Mapper.class)
class MybatisConfiguration {
}
