package pe.edu.idat.ec2.leo.pinedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.idat.ec2.leo.pinedo.model.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer>{
	

}
