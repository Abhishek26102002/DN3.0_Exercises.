public class ECommercePlatform {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 150.75),
            new Order("O003", "Charlie", 300.20),
            new Order("O004", "David", 99.99),
            new Order("O005", "Eve", 450.00)
        };

        // Bubble Sort
        System.out.println("Bubble Sort:");
        BubbleSort.bubbleSort(orders);
        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        System.out.println("\nQuick Sort:");
        Order[] ordersForQuickSort = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 150.75),
            new Order("O003", "Charlie", 300.20),
            new Order("O004", "David", 99.99),
            new Order("O005", "Eve", 450.00)
        };
        QuickSort.quickSort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }
    }
}
