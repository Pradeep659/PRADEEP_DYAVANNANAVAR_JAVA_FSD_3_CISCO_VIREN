package cisco.simplilearn.phase3.repository;




import java.util.List;

import javax.transaction.Transactional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cisco.simplilearn.phase3.model.Product;

@Repository
@Transactional
public interface ProductRepository extends  CrudRepository<Product,Integer> {

	public List<Product> findByDiscount(int discount);

	public List<Product> findByCategory(String category);
	
	public List<Product> findByColor(String color);
	
	public List<Product> findByBrand(String brand);

	public List<Product> findBySeason(String season);
}
