package config;

public class APIConfigs {
    public static class FakeSore {
        public static final String BASE_URL = "https://fakestoreapi.com";
        public static final String LOGIN_URL = BASE_URL + "/auth/login";
    }

    public static class FakeStoreEndpoints {
        public static final String PRODUCTS_ENDPOINT = "/products";
        public static final String CATEGORIES_ENDPOINT = PRODUCTS_ENDPOINT + "/categories";
        public static final String CATEGORY_ENDPOINT = PRODUCTS_ENDPOINT + "/category";
        public static final String CART_ENDPOINT = "/cart";
        public static final String USER_CART = CART_ENDPOINT + "/user";
        public static final String USERS_ENDPOINT = "/users";
    }

}
