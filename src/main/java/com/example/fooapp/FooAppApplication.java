package com.example.fooapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class FooAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FooAppApplication.class, args);
	}
}

interface FooRepository extends JpaRepository<Foo, UUID> {

}

@RestController
class FooController {

	private final FooRepository fooRepository;

	public FooController(FooRepository fooRepository) {
		this.fooRepository = fooRepository;
	}

	@GetMapping("/foos")
	public List<Foo> getAll() {
		return fooRepository.findAll();
	}

	@PostMapping("/foos")
	public Foo create(@RequestBody Foo foo) {
		return fooRepository.save(foo);
	}
}

@Entity
class Foo {

	@Id
	@GeneratedValue
	private UUID id;

	private String bar;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}
}
