package Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.CreditCard;



@Repository
public interface ICreditCardRepository extends  JpaRepository<CreditCard,Long>{

	

}
