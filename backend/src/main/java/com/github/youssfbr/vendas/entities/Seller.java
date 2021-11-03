package com.github.youssfbr.vendas.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Seller {

    @Setter
    private Long id;

    @Setter
    private String name;

    private List<Sale> sales = new ArrayList<>();
}
