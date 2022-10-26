package pe.edu.idat.ec2.leo.pinedo.service;

import java.util.List;

import pe.edu.idat.ec2.leo.pinedo.model.Producto;

public interface ProductoService {
	
	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);

}
