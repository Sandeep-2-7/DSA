package Learn_The_Basic.Know_Basic_Math;

import java.util.Scanner;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int high = 1;
        for(int i=1;i<=x/2;i++){
            if(x%i==0 && y%i==0)
                high = i;
        }
        System.out.print(high);
//        List<Fruit> fruits = new ArrayList<>();
//        fruits.add(new Fruit("Apple", 120));
//        fruits.add(new Fruit("Banana", 40));
//        fruits.add(new Fruit(null, 150));
//        fruits.add(new Fruit("Orange", 60));
//
//        // 1️⃣ Sort by name
//        fruits.sort(Comparator.comparing(Fruit::getName));
//        System.out.println("Sorted by name:");
//        System.out.println(fruits);

//        // 2️⃣ Sort by price
//        fruits.sort(Comparator.comparing(Fruit::getPrice));
//        System.out.println("\nSorted by price:");
//        System.out.println(fruits);
//
//        // 3️⃣ Sort by price (descending)
//        fruits.sort(Comparator.comparing(Fruit::getPrice).reversed());
//        System.out.println("\nSorted by price (descending):");
//        System.out.println(fruits);


    }

    }

