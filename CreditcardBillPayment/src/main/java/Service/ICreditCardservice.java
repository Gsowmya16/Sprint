package Service;


import java.util.List;

import entity.CreditCard;

public interface ICreditCardservice {

	public CreditCard addCreditCard(CreditCard creditcard);

	public CreditCard removeCreditCard(long cardId);

	public CreditCard updateCreditCard(long cardId,CreditCard creditCard);

	public CreditCard getCreditCard(long carId);

	public List<CreditCard> getAllCreditCard();

}
