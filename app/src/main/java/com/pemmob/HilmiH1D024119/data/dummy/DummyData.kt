package com.pemmob.HilmiH1D024119.data.dummy

import com.pemmob.HilmiH1D024119.data.model.Category
import com.pemmob.HilmiH1D024119.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        // Kategori Makanan
        Product(id = 1, category_id = 1, category = categories[0], name = "Kripik Singkong", description = "Kripik gurih", price = 15000.0, stock = 20, img = "dummy_product"),
        Product(id = 2, category_id = 1, category = categories[0], name = "Mendoan", description = "Tempe mendoan hangat", price = 20000.0, stock = 15, img = "dummy_product"),
        Product(id = 3, category_id = 1, category = categories[0], name = "Sale Pisang", description = "Sale manis renyah", price = 25000.0, stock = 30, img = "dummy_product"),
        Product(id = 4, category_id = 1, category = categories[0], name = "Getuk Goreng", description = "Getuk khas Sokaraja", price = 30000.0, stock = 40, img = "dummy_product"),
        Product(id = 5, category_id = 1, category = categories[0], name = "Nopia", description = "Kue nopia klasik", price = 18000.0, stock = 25, img = "dummy_product"),

        // Kategori Minuman
        Product(id = 6, category_id = 2, category = categories[1], name = "Es Dawet", description = "Dawet segar", price = 10000.0, stock = 50, img = "dummy_product"),
        Product(id = 7, category_id = 2, category = categories[1], name = "Kopi Badhek", description = "Kopi aroma kelapa", price = 15000.0, stock = 20, img = "dummy_product"),
        Product(id = 8, category_id = 2, category = categories[1], name = "Wedang Jahe", description = "Jahe hangat rempah", price = 8000.0, stock = 30, img = "dummy_product"),
        Product(id = 9, category_id = 2, category = categories[1], name = "Teh Poci", description = "Teh poci gula batu", price = 7000.0, stock = 35, img = "dummy_product"),
        Product(id = 10, category_id = 2, category = categories[1], name = "Jeruk Hangat", description = "Jeruk peras murni", price = 8000.0, stock = 25, img = "dummy_product"),

        // Kategori Kerajinan
        Product(id = 11, category_id = 3, category = categories[2], name = "Batik Tulis", description = "Kain batik lokal", price = 150000.0, stock = 10, img = "dummy_product"),
        Product(id = 12, category_id = 3, category = categories[2], name = "Sandal Bandol", description = "Sandal ban bekas", price = 35000.0, stock = 15, img = "dummy_product"),
        Product(id = 13, category_id = 3, category = categories[2], name = "Sapu Glagah", description = "Sapu lantai glagah", price = 25000.0, stock = 40, img = "dummy_product"),
        Product(id = 14, category_id = 3, category = categories[2], name = "Anyaman Bambu", description = "Kerajinan bambu", price = 50000.0, stock = 12, img = "dummy_product"),
        Product(id = 15, category_id = 3, category = categories[2], name = "Ulekan Batu", description = "Cobek batu asli", price = 45000.0, stock = 8, img = "dummy_product")
    )
}
