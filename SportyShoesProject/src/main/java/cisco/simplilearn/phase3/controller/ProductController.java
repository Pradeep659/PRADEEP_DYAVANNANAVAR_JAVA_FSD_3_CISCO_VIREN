
package cisco.simplilearn.phase3.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cisco.simplilearn.phase3.model.Product;
import cisco.simplilearn.phase3.repository.ProductRepository;

@RestController
@RequestMapping("products")
public class ProductController {
	
	@Autowired
	ProductRepository productrepository;
	
	// retrieve all Shoes from database
	@GetMapping("all")
	public List<Product> getAllProduct() 
	{
		List<Product> product = (List<Product>) productrepository.findAll();
		return product;
	}
	
	// insert new Shoes into database
	@PostMapping("add")
	public Product addProduct(@RequestBody Product product)
	{
		return productrepository.save(product);
	}
	
	// get particular Shoes by their ID
	@GetMapping("product/{id}")
	public Optional<Product> getProductId(@PathVariable int id)
	{
		return productrepository.findById(id);
	}
	
	// update existing Shoes
	@PutMapping("update/{id}")
	public Product updateProduct(@RequestBody Product product)
	{
		return productrepository.save(product);
	}
	
	// delete particular Product from database
		@DeleteMapping("delete/{id}")
		public void deleteProduct(@PathVariable int id)
		{
			productrepository.deleteById(id);
		}
		
	// get particular shoe by season
    	@GetMapping("shoeseason/{season}")
        public List<Product> getProductSeason(@PathVariable String season)
        {
    		List<Product> searchBySeason =  productrepository.findBySeason(season);
 			return searchBySeason;
	    }
		//Get particular show by brand
		@GetMapping("shoebrand/{brand}")
		public List<Product> getProductBrand(@PathVariable String brand)
		{
			List<Product> searchByBrand = (List<Product>) productrepository.findByBrand(brand);
			return searchByBrand;
		}
		//Get particular show by brand
		@GetMapping("shoecolor/{color}")
		public List<Product> getProductColor(@PathVariable String color)
		{
			List<Product> searchByColor = (List<Product>) productrepository.findByColor(color);
			return searchByColor;
		}	
		
		
		@GetMapping("shoecategory/{category}")
		public List<Product> getProductCategory(@PathVariable String category)
		{
			List<Product> searchByCategory =  (List<Product>) productrepository.findByCategory(category);
			return searchByCategory;
		}
		
		
		@GetMapping("shoediscount/{discount}")
		public List<Product> getProductDiscount(@PathVariable int discount)
		{
			List<Product> searchByDiscount = (List<Product>) productrepository.findByDiscount(discount);
			return searchByDiscount;
		}
		
}