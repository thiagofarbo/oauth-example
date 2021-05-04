package com.example.oauth.service;

import com.example.oauth.domain.Company;
import com.example.oauth.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository repository;

    public Company create(final Company company){
        final Company newCompany = repository.save(company);
        return newCompany;
    }

    public Company find(final String id){
        final Optional<Company> company = repository.findById(id);
        return company.get();
    }
}
