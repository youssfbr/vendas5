package com.github.youssfbr.vendas.services;

import com.github.youssfbr.vendas.dto.SaleDTO;
import com.github.youssfbr.vendas.entities.Sale;
import com.github.youssfbr.vendas.repositories.ISaleRepository;
import com.github.youssfbr.vendas.repositories.ISellerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService implements ISaleService {

    private final ISaleRepository saleRepository;
    private final ISellerRepository sellerRepository;

    public SaleService(final ISaleRepository saleRepository, final ISellerRepository sellerRepository) {
        this.saleRepository = saleRepository;
        this.sellerRepository = sellerRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(sale -> new SaleDTO(sale));
    }

}
