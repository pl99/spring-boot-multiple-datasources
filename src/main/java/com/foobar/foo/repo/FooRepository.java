package com.foobar.foo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.foobar.foo.domain.Foo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Repository
@RequestMapping("/foo/id")
public interface FooRepository extends JpaRepository<Foo, Long> {


  Optional<Foo> findById(@RequestParam("id") Long id);

}
