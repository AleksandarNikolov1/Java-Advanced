//package Stacks_and_Queues.Lab;
//
//import java.util.ArrayDeque;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class MathPotato_07 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        ArrayDeque<String> queue = Arrays.stream(sc.nextLine().split("\\s+"))
//                .collect(Collectors.toCollection(ArrayDeque::new));
//
//        int n = Integer.parseInt(sc.nextLine());
//
//        for (int i = 1; i < n; i++) {
//            queue.offer(queue.poll());
//        }
//
//
//            System.out.printf("Removed %s%n", queue.poll());
//            System.out.printf("Prime %s%n", queue.peekFirst());
//
//        while (queue.size() > 1) {
//            for (int i = 1; i < n; i++) {
//                queue.offer(queue.poll());
//            }
//
//            System.out.printf("Prime %s%n", queue.getFirst());
//            System.out.printf("Removed %s%n", queue.poll());
//        }
//
//
//        System.out.printf("Last is %s", queue.poll());
//    }
//}
