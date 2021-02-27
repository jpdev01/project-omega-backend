package com.onroad.backend.service;

import com.onroad.backend.entity.Sale;
import com.onroad.backend.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public void save(Sale sale)
    {
        repository.save(sale);
    }

    public List<Sale> findAll()
    {
        return repository.findAll();
    }

    public Optional<Sale> findById(Integer id)
    {
        return repository.findById(id);
    }

}