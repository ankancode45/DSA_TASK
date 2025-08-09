import java.util.Scanner;

class ApplyStack {
    public static void main(String... args) {
        int choice, X;
        Scanner sc = new Scanner(System.in);
        StackArray st = new StackArray(8);

        while (true) {
            System.out.println("1> Push an element. ");
            System.out.println("2> Pop an element. ");
            System.out.println("3> Display the Top element. ");
            System.out.println("4> Display all elements. ");
            System.out.println("5> Display the Size of the Stack. ");
            System.out.println("6> Search for a target element. ");
            System.out.println("7> Quit.\n");
            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();

            if (choice == 7)
                break;

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be pushed: ");
                    X = sc.nextInt();
                    st.push(X);
                    break;

                case 2:
                    X = st.pop();
                    System.out.println("Popped element is: " + X);
                    break;

                case 3:
                    System.out.println("Element at the Top is: " + st.peek());
                    break;

                case 4:
                    st.display();
                    break;

                case 5:
                    System.out.println("Size of the Stack is: " + st.size());
                    break;

                case 6:
                    System.out.println("Enter target to search: ");
                    int searchValue = sc.nextInt();
                    System.out.println(st.search(searchValue));
                    break;

                default:
                    System.out.println("Bad Choice!!!!");
            }
            System.out.println("----------");
        }
        sc.close();
    }
}