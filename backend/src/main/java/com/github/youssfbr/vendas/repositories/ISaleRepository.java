package com.github.youssfbr.vendas.repositories;

import com.github.youssfbr.vendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleRepository extends JpaRepository<Sale, Long> {
}
