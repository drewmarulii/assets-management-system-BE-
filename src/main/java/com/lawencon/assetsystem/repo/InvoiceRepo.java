package com.lawencon.assetsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lawencon.assetsystem.model.Invoice;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice, Long>{

}
