package com.github.youssfbr.vendas.controllers;

import com.github.youssfbr.vendas.dto.SaleDTO;
import com.github.youssfbr.vendas.dto.SaleSuccessDTO;
import com.github.youssfbr.vendas.dto.SaleSumDTO;
import com.github.youssfbr.vendas.services.ISaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {

    private final ISaleService saleService;

    public SaleController(final ISaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(saleService.findAll(pageable));
    }

    @GetMapping("/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        return ResponseEntity.ok(saleService.amountGroupedBySeller());
    }

    @GetMapping("/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
        return ResponseEntity.ok(saleService.successGroupedBySeller());
    }

}
