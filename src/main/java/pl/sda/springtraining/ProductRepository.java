package pl.sda.springtraining;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    @Query("SELECT p FROM Product p WHERE upper(p.productName) LIKE concat('%',upper(?1),'%')")
//    @Query(nativeQuery = true,value = "SELECT * FROM Product p WHERE upper(p.productName) LIKE concat('%',upper(?1),'%')")
    List<Product> findAllByNameLike(String searchText);

    List<Product> findAllByProductNameLike(String searchText); //zapytanie generowane na podstawie nazwy metody
}
