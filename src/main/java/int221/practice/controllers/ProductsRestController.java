package int221.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import int221.practice.models.Brand;
import int221.practice.models.Product;
import int221.practice.repositories.ProductsJpaRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class 	t {
	@Autowired
	ProductsJpaRepository productsJpaRepository;

//	@GetMapping("/products/{code}")
//	public Product show(@PathVariable String code) {
//
//		return productsJpaRepository.findById(code).orElse(null);
//	}
//
//	@GetMapping("/products")
//	public List<Product> allProducts() {
//		return productsJpaRepository.findAll();
//	}
 
	@RequestMapping // รับrequestทุกชนิด
	public String request() {

		return;
	};

	@GetMapping // รับแบบget
	public String get() {

		return;
	};

	@PostMapping // รับแบบPost
	public String post() {

		return;
	};

	@PutMapping // รับแบบPut
	public String put() {

		return;
	};

	@DeleteMapping // รับแบบDelete
	public String delete() {

		return;
	};

}
