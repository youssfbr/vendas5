package com.github.youssfbr.vendas.repositories;

import com.github.youssfbr.vendas.dto.SaleSuccessDTO;
import com.github.youssfbr.vendas.dto.SaleSumDTO;
import com.github.youssfbr.vendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ISaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.github.youssfbr.vendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            " FROM Sale as obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.github.youssfbr.vendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            " FROM Sale as obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
