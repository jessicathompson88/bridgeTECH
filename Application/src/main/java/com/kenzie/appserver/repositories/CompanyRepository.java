package com.kenzie.appserver.repositories;

import com.kenzie.appserver.repositories.model.CompanyRecord;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface CompanyRepository extends CrudRepository<CompanyRecord, String> {

}

