package org.example.data.dao.controller;

import org.example.data.services.ProductoService;
import org.example.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @PostMapping
    public void guardarProducto(@RequestBody Producto producto) {
        productoService.createProducto(producto);
    }

    @PutMapping("/{id}")
    public void actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        productoService.modifyProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
    }
}
