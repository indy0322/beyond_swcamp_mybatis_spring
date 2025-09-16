package org.ohgiraffers.transactional.section01.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OderMenu {
    private int orderCode;
    private int menuCode;
    private int orderAmount;
}
