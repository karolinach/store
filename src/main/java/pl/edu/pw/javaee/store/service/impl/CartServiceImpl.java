package pl.edu.pw.javaee.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pw.javaee.store.dao.CartDao;
import pl.edu.pw.javaee.store.model.Cart;
import pl.edu.pw.javaee.store.service.CartService;

/**
 * Created by chada on 11.11.2016.
 */
@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(long id) {
       return cartDao.getCartById(id);
    }

    public void update (Cart cart) {
        cartDao.update(cart);
    }
}
