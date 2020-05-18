package com.pluralsight.trackzilla.repository;

import com.pluralsight.trackzilla.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
