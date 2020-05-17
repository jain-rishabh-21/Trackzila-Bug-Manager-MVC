package com.pluralsight.trackzilla.repositories;

import com.pluralsight.trackzilla.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
