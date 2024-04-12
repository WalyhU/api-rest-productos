package org.example.data.services;

import org.example.entities.Producto;

import java.util.List;

public interface ProductoService {
    public List<Producto> findAll();

    public Producto findById(Long id);

    public void createProducto(Producto producto);

    public void modifyProducto(Long id, Producto producto);

    public void deleteProducto(Long id);
}
