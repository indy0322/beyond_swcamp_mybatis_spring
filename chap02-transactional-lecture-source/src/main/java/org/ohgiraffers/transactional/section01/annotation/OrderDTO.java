package org.ohgiraffers.transactional.section01.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/* 설명. 주문한 시각 및 사용자의 주문건을 포함한 DTO(controller-service-dao 사이에서 쓸 수 엤게 만든) */


@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {
    private LocalDate orderDate;   // 서버의 현재 날짜
    private LocalTime orderTime;   // 서버의 현재 시간
    
    private List<OrderMenuDTO> orderMenus;  // 한 건의 주문에 고객이 주문한 메뉴들
}
