package com.github.youssfbr.vendas.services;

import com.github.youssfbr.vendas.dto.SellerDTO;
import com.github.youssfbr.vendas.entities.Seller;
import com.github.youssfbr.vendas.repositories.ISellerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService implements ISellerService {

    private final ISellerRepository sellerRepository;

    public SellerService(final ISellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<SellerDTO> findAll() {
        List<Seller> result = sellerRepository.findAll();
        return result.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
    }
}
