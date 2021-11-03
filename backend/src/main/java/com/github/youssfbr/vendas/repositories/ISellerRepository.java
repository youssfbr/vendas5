package com.github.youssfbr.vendas.repositories;

import com.github.youssfbr.vendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISellerRepository extends JpaRepository<Seller, Long> {
}
