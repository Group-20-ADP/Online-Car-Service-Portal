package za.ac.cput.Factory;
import za.ac.cput.Entity.Cart;

public class CartFactory {
    public static Cart createCart(String cartID, String customerID, String payment, String booking){
        return new Cart.CartBuilder().setCartID(cartID).setCustomerID(customerID).setPayment(payment).setBooking(booking).builder();
    }
}
