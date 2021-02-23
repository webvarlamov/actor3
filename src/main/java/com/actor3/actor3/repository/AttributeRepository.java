package com.actor3.actor3.repository;

import com.actor3.actor3.entity.Attribute;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AttributeRepository extends PagingAndSortingRepository<Attribute, String> {
}
