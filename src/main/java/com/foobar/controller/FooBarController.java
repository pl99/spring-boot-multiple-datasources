package com.foobar.controller;

import com.foobar.FooBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foobar.bar.domain.Bar;
import com.foobar.bar.repo.BarRepository;
import com.foobar.foo.domain.Foo;
import com.foobar.foo.repo.FooRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class FooBarController {

  private final FooRepository fooRepo;
  private final BarRepository barRepo;

  @Autowired
  FooBarController(FooRepository fooRepo, BarRepository barRepo) {
    this.fooRepo = fooRepo;
    this.barRepo = barRepo;
  }

  @RequestMapping("/foobar/{id}")
  public HashMap<String, String> fooBar(@PathVariable("id") Long id) {
    Optional<Foo> foo = fooRepo.findById(id);
    Optional<Bar> bar = barRepo.findById(id);
    Map<String, String> map = new HashMap<>();

    String barDept="";
    String fooName="";
    if (bar.get()!=null && foo.get()!=null) {
      map.put(bar.get().getDept(), foo.get().getDept());
      map.put(bar.get().getName(), foo.get().getName());
      map.put(bar.get().getId().toString(), foo.get().getId().toString());
    }

//    return new FooBar(fooName, barDept );
      return (HashMap<String, String>) map;
  }

}
