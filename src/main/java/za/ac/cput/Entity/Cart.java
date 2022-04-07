package za.ac.cput.Entity;

public class Cart {
    private String cartID;
    private String customerID;
    private String payment;
    private String booking;

    private Cart (CartBuilder builder) {
        this.cartID = builder.cartID;
        this.customerID = builder.customerID;
        this.payment = builder.payment;
        this.booking = builder.booking;

    }
        public String setCartID(String cartID) {
            this.cartID = cartID;
            return cartID;
        }

        public String setCustomerID(String customerID) {
            this.customerID = customerID;
            return customerID;
        }

        public String setPayment(String payment) {
            this.payment = payment;
            return payment;
        }

        public String setBooking(String booking) {
            this.booking = booking;
            return booking;
        }


        @Override
        public String toString() {
            return "Cart{" +
                    "cartID='" + cartID + '\'' +
                    ", customerID='" + customerID + '\'' +
                    ", payment='" + payment + '\'' +
                    ", booking='" + booking + '\'' +
                    '}';


        }
        public static class CartBuilder{
            private String cartID;
            private String customerID;
            private String payment;
            private String booking;


            public CartBuilder setCartID(String cartID) {
                this.cartID = cartID;
                return this;
            }

            public CartBuilder setCustomerID(String customerID) {
                this.customerID = customerID;
                return this;
            }

            public CartBuilder setPayment(String payment) {
                this.payment = payment;
                return this;
            }

            public CartBuilder setBooking(String booking) {
                this.booking = booking;
                return this;
            }

            public Cart builder(){return new Cart(this);}

        }
}




