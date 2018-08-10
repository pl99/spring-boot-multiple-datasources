package com.foobar.bar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.foobar.bar.domain.Bar;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Repository
@RequestMapping("/bar")
public interface BarRepository extends JpaRepository<Bar, Long> {

  Optional<Bar> findById(@Param("id") Long id);

}
