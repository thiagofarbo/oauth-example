package com.example.oauth.repository;

import com.example.oauth.domain.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CompanyRepository extends MongoRepository<Company, String> {
}
