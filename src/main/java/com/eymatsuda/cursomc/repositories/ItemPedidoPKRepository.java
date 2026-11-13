package com.eymatsuda.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eymatsuda.cursomc.domain.ItemPedido;
import com.eymatsuda.cursomc.domain.ItemPedidoPK;

@Repository
public interface ItemPedidoPKRepository extends JpaRepository<ItemPedido, ItemPedidoPK> {

}
