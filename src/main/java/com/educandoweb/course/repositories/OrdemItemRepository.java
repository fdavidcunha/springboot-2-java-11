package com.educandoweb.course.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.course.entities.OrderItem;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long>{

}
