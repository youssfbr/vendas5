package com.github.youssfbr.vendas.services;

import com.github.youssfbr.vendas.dto.SaleDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ISaleService {

    Page<SaleDTO> findAll(Pageable pageable);
}
