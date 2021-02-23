package com.actor3.actor3.repository;

import com.actor3.actor3.entity.Offer;
import com.actor3.actor3.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<User, String> {
    User findByUsername(String username);
}
