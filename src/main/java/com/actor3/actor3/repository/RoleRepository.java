package com.actor3.actor3.repository;

import com.actor3.actor3.entity.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RoleRepository extends PagingAndSortingRepository<Role, String> {
}
