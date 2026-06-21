/**
 *
 * @author jkmen
 */

package com.autorepairshop.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.autorepairshop.model.Product;

public class ProductDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/autoRepairShop?useSSL=false&serverTimezone=UTC";
	private String jdbcUsername = "root";
	private String jdbcPassword = "5070";

    private static final String SELECT_ALL_PRODUCTS = "SELECT * FROM products";

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement ps = connection.prepareStatement(SELECT_ALL_PRODUCTS)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                products.add(new Product(id, name, price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
}
