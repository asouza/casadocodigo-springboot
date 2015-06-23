package br.com.casadocodigo.loja.daos;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import br.com.casadocodigo.loja.models.BookType;
import br.com.casadocodigo.loja.models.Product;

@org.springframework.stereotype.Repository
public interface ProductDAO extends Repository<Product, Integer>{
	
	@Query("select distinct(p) from Product p join fetch p.prices where p.id=:id")
	public Product findOne(@Param("id") Integer id);

	@Query("select sum(price.value) from Product p join p.prices price where price.bookType = :book")
	public BigDecimal sumPricesPerType(@Param("book") BookType book);
	
	public List<Product> findByPagesGreaterThan(@Param("pages") int pages);
	
	public List<Product> findAll();
	
	public Product save(Product product);
	
}