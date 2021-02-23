package com.actor3.actor3.repository;

import com.actor3.actor3.entity.AttributeValue;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AttributeValueRepository extends PagingAndSortingRepository<AttributeValue, String> {
}
