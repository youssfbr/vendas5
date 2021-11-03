package com.github.youssfbr.vendas.services;

import com.github.youssfbr.vendas.dto.SellerDTO;
import com.github.youssfbr.vendas.entities.Seller;

import java.util.List;

public interface ISellerService {

    List<SellerDTO> findAll();
}
