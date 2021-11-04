package com.github.youssfbr.vendas.services;

import com.github.youssfbr.vendas.dto.SaleDTO;
import com.github.youssfbr.vendas.dto.SaleSuccessDTO;
import com.github.youssfbr.vendas.dto.SaleSumDTO;
import com.github.youssfbr.vendas.entities.Sale;
import com.github.youssfbr.vendas.repositories.ISaleRepository;
import com.github.youssfbr.vendas.repositories.ISellerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService implements ISaleService {

    private final ISaleRepository saleRepository;
    private final ISellerRepository sellerRepository;

    public SaleService(final ISaleRepository saleRepository, final ISellerRepository sellerRepository) {
        this.saleRepository = saleRepository;
        this.sellerRepository = sellerRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(sale -> new SaleDTO(sale));
    }

    @Override
    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        sellerRepository.findAll();
        return saleRepository.amountGroupedBySeller();
    }

    @Override
    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller() {
        sellerRepository.findAll();
        return saleRepository.successGroupedBySeller();
    }

}
