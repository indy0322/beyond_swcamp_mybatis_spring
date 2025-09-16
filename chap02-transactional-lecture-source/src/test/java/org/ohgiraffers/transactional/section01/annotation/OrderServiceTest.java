package org.ohgiraffers.transactional.section01.annotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceTest {
    @Autowired
    OrderService orderService;

    /* 설명. Controller 계층에서 사용자의 입력값 + 서버의 현재 시간을 넣은 OrderDTO가 넘어왔다는 가정 */
    private static Stream<Arguments> getOrderInfo() {
        OrderDTO orderInfo = new OrderDTO();
        orderInfo.setOrderDate(LocalDate.now());
        orderInfo.setOrderTime(LocalTime.now());

        orderInfo.setOrderMenus(
                List.of(
                        new OrderMenuDTO(2,1),
                        new OrderMenuDTO(3,2),
                        new OrderMenuDTO(5,3),
                        new OrderMenuDTO(8,4)
                )
        );

        return Stream.of(
                Arguments.of(orderInfo),
                Arguments.of(orderInfo)
        );
    }

    @DisplayName("주문 등록 테스트")
    @ParameterizedTest
    @MethodSource("getOrderInfo")
    void testRegistNewOrder(OrderDTO orderInfo){
        Assertions.assertDoesNotThrow(() -> orderService.registNewOrder(orderInfo));
    }
}