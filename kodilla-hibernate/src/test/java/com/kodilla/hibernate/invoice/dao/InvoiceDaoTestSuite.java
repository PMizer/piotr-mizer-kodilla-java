package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.dao.InvoiceDao;
import com.kodilla.hibernate.dao.ProductDao;
import com.kodilla.hibernate.dao.ItemDao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void InvoiceDaoTestSuite(){
        //Given
        Product product1 = new Product("maslo");
        Product product2 = new Product("mieso");

        List<Item> items = new ArrayList<>();
        Item item1 = new Item(product1, new BigDecimal(30),2);
        Item item2 = new Item(product2, new BigDecimal(50),5);
        items.add(item1);
        items.add(item2);

        Invoice invoice1 = new Invoice("123");
        invoice1.setItems(Arrays.asList(item1,item2));

        //Then

        invoiceDao.save(invoice1);
        int invoiceId = invoice1.getId();


        //When
        Assert.assertEquals(2, productDao.count());
        Assert.assertEquals(2, itemDao.count());
        Assert.assertEquals(1, invoiceDao.count());
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp

        try {
            productDao.deleteAll();
            itemDao.deleteAll();
            invoiceDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }

    }
}
