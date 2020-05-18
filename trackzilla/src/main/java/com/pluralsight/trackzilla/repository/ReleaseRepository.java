package com.pluralsight.trackzilla.repository;

import com.pluralsight.trackzilla.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
