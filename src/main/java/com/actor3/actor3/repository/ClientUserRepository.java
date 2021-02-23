package com.actor3.actor3.repository;

import com.actor3.actor3.entity.ClientUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientUserRepository extends PagingAndSortingRepository<ClientUser, String> {
}
