package pl.edu.pw.javaee.store.dao;

import pl.edu.pw.javaee.store.model.Cart;
import pl.edu.pw.javaee.store.model.CartItem;
import pl.edu.pw.javaee.store.model.CustomerOrder;

import java.io.IOException;

/**
 * Created by chada on 11.11.2016.
 */
public interface CartItemDao {
    void addCartItem(CartItem cartItem);
    void removeCartItem(CartItem cartItem);
    void removeAllCartItems(Cart cart);
    CartItem getCartItemByProductId(long productId);

}
