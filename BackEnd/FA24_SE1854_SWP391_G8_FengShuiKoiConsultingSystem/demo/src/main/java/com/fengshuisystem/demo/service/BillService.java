package com.fengshuisystem.demo.service;

import com.fengshuisystem.demo.dto.BillDTO;
import com.fengshuisystem.demo.dto.PageResponse;
import com.fengshuisystem.demo.entity.enums.BillStatus;
import com.fengshuisystem.demo.entity.enums.Request;

import java.math.BigDecimal;
import java.util.List;

public interface BillService {
    BillDTO createBillByRequestAndPayment(Integer requestId, Integer paymentId);
    List<BillDTO> searchBills(BillStatus status, String createdBy, BigDecimal minTotalAmount, BigDecimal maxTotalAmount, String paymentMethod);
    BillDTO getBillById(Integer billId);
    void updateStatusAfterPayment(Integer billId, BillStatus billStatus, Request requestStatus);
    Integer getRequestIdByBillId(Integer billId);
    BigDecimal getTotalIncomeThisMonth();
    List<Object[]> countTotalMoneyBetweenDates();
    PageResponse<BillDTO> getAllBills(int page, int size);
}
