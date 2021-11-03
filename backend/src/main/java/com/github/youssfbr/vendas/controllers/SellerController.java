package com.github.youssfbr.vendas.controllers;

import com.github.youssfbr.vendas.dto.SellerDTO;
import com.github.youssfbr.vendas.services.ISellerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    private final ISellerService sellerService;

    public SellerController(final ISellerService sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        return ResponseEntity.ok(sellerService.findAll());
    }
}
