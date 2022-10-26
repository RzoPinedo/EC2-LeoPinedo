package pe.edu.idat.ec2.leo.pinedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.idat.ec2.leo.pinedo.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
