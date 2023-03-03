package com.application.BulkUpload.Repository;

import com.application.BulkUpload.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveriesRepo extends JpaRepository<Delivery, Long> {
}
