package org.example.data.services;

import org.example.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.example.data.dao.ProductoDao;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>)productoDao.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    public void createProducto(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public void modifyProducto(Long id, Producto producto) {
        if (productoDao.existsById(id)) {
            producto.setId(id);
            productoDao.save(producto);
        }
    }

    @Override
    public void deleteProducto(Long id) {
        if (productoDao.existsById(id)) {
            productoDao.deleteById(id);
        }
    }

}
