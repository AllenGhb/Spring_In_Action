package cart;

import java.io.Serializable;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/9/4
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 7154842852894819401L;

    private String sku;
    private String name;
    private float price;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
