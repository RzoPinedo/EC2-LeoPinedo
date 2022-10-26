package pe.edu.idat.ec2.leo.pinedo.service;

import java.util.List;

import pe.edu.idat.ec2.leo.pinedo.model.Bodega;

public interface BodegaService {

	void guardar(Bodega bodega);
	void actualizar(Bodega bodega);
	void eliminar(Integer id);
	List<Bodega> listar();
	Bodega obtener(Integer id);
}
