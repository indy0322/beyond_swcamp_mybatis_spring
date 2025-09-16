package org.ohgiraffers.transactional.section01.annotation;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    void insertOrder(Order order);

    void insertOrderMenu(OrderMenu orderMenu);
}
