package com.dddd.mobilekiosk.repository;

import com.dddd.mobilekiosk.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query(value = "select Menu.name, Menu.price, Menu.category, Menu.picture from Menu menu where menu.storeID = :store_Id")
    List<Menu> findMenusByStoreID(@Param("store_Id") Long store_Id);
}
