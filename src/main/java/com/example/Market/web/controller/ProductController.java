package com.example.Market.web.controller;

import com.example.Market.domain.Product;
import com.example.Market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RequestMapping("/products")
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>(productService.getAlLProducts(), HttpStatus.OK);
    }

    @GetMapping("/{idProduct}")
    public ResponseEntity<Product> getById(@PathVariable("idProduct") Integer idProduct) {
         return productService.getById(idProduct)
                 .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                 .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/category/{idCategory}")
    public ResponseEntity<List<Product>> getByCategory(@PathVariable("idCategory") Integer idCategory){
        List<Product>  products = productService.getByCategory(idCategory);
        if(!products.isEmpty()) {
            return new ResponseEntity<>(products, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/scarseProducts/{quantityStock}")
    public List<Product> getScarseProducts(@PathVariable("quantityStock") Integer quantityStock, Boolean status){
        return productService.getScarseProduct(quantityStock, true);
    }

    @GetMapping("/nameProduct/{nameProduct}")
    public ResponseEntity<?> getByNameProduct(@PathVariable("nameProduct") String nameProduct){
        Optional<Product> productByName = productService.getByNameProduct(nameProduct);
        if(productByName.isPresent()){
            return new ResponseEntity<>(nameProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Producto no encontrado: " + nameProduct, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody Product product){

        Product createdProduct = productService.save(product);
        try {
            return new ResponseEntity<>(createdProduct, HttpStatus.OK);
        } catch (IllegalArgumentException e){
            return new ResponseEntity<>("Error al crear el producto" + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{idProduct}")
    public ResponseEntity<String> delete(@PathVariable("idProduct") Integer idProduct){
        try {
            boolean isDeleted = productService.delete(idProduct);
            if(isDeleted){
                return ResponseEntity.ok("Producto eliminado correctamente");
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No se pudo eliminar el producto");
            }

        } catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


}
