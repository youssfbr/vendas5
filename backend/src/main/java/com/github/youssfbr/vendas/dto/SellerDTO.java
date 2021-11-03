package com.github.youssfbr.vendas.dto;

import com.github.youssfbr.vendas.entities.Seller;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellerDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
