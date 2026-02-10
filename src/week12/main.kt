package week12

enum class OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

data class Order(val id: Int, val price: Double, val status: OrderStatus)

fun handleOrderStatus(order: Order){
    when(order.status){
        OrderStatus.NEW -> println("Order No. ${order.id} has been accepted. Thank you.")
        OrderStatus.PROCESSING -> println("We pack your purchases for ${order.price} pln.")
        OrderStatus.SHIPPED, OrderStatus.DELIVERED -> println("Your order is on its way or has arrived.")
        OrderStatus.CANCELLED -> println("Order canceled.")
    }
}

fun main(){
    val orders = listOf<Order>(Order(1, 12.50, OrderStatus.NEW), Order(2, 25.00, OrderStatus.PROCESSING), Order(3, 25.00, OrderStatus.DELIVERED), Order(4, 25.00, OrderStatus.CANCELLED))

    for(order in orders){
        handleOrderStatus(order)
    }
}