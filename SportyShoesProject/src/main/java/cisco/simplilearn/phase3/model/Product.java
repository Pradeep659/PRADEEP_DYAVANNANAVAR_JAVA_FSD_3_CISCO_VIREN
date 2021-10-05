package cisco.simplilearn.phase3.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product")
public class Product {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name = "product_id")
 private int productId;
 
 @Column(name = "product_name")
 private String productName;
 
 @Column(name = "season")
 private String season;
 
 @Column(name = "brand")
 private String brand;
 
 @Column(name = "category")
 private String category;
 
 @Column(name = "price")
 private int price;
 
 @Column(name= "color")
 private String color;
 

 
 @Column(name = "discount")
 private int discount;
 
public Product(int productId, String productName, String season, String brand, String category, int price,
		String color, String createDate, int discount) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.season = season;
	this.brand = brand;
	this.category = category;
	this.price = price;
	this.color = color;
	
	this.discount = discount;
}
public Product() {
	super();
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getSeason() {
	return season;
}
public void setSeason(String season) {
	this.season = season;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}

@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", season=" + season + ", brand="
			+ brand + ", category=" + category + ", price=" + price + ", color=" + color + ",  discount=" + discount + "]";
}
}
