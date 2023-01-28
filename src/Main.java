public class Main {
    public static void main(String args[]) {

        System.out.println("\n UAS Struktur Data \n Nama : Sheryl P. D. E. Silalahi " + "\n Kelas : TIF PK 22" + "\n NPM : 22552011122 ");


        System.out.println("\n 1a. Stack");

        ArrayStack stack = new ArrayStack(5);

        stack.push(new Book("Lana", 12, 45));
        stack.push(new Book("Prita", 5, 32));
        stack.push(new Book("Lucy", 9, 52));
        stack.push(new Book("Pram", 11, 78));
        stack.push(new Book("Mion", 6, 21));
        stack.push(new Book("Larisa", 4, 19));
        stack.push(new Book("Erza", 7, 65));
        stack.push(new Book("Hani", 10, 99));
        stack.push(new Book("Maya", 8, 84));

        System.out.println("\n Stack :");

        stack.printStack();

        stack.pop();

        System.out.println("\n After pop :");

        stack.printStack();

        System.out.println("\n 1b. Queue");

        Book Lana = new Book("Lana", 12, 45);
        Book Prita = new Book("Prita", 5, 32);
        Book Lucy = new Book("Lucy", 9, 52);
        Book Pram = new Book("Pram", 11, 78);
        Book Mion = new Book("Mion", 6, 21);
        Book Larisa = new Book("Larisa", 4, 19);
        Book Erza = new Book("Erza", 7, 65);
        Book Hani = new Book("Hani", 10, 99);
        Book Maya = new Book("Maya", 8, 84);

        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(Lana);
        queue.enqueue(Prita);
        queue.enqueue(Lucy);
        queue.enqueue(Pram);
        queue.enqueue(Mion);
        queue.enqueue(Larisa);
        queue.enqueue(Erza);
        queue.enqueue(Hani);
        queue.enqueue(Maya);

        System.out.println("\n Queue :");

        queue.printQueue();

        System.out.println("\n After dequeue :");

        queue.dequeue();

        queue.printQueue();


        System.out.println("\n 2a. Linear search recursive function");

        String[] array = {"Roti", "Susu", "Air", "Buah", "Sayur", "Ikan", "Ayam", "Bakso", "Es krim", "Boba", "Steak"};
        //to test the linear search with recursive function for array of string, program below

        System.out.println("\n The elements of the array is defined as : ");
        for (String i : array) {
            System.out.print(i +", ");
        }

        String x = "Ikan";

        System.out.println("\n \n The elements to be searched in the array is: " + x);

        int index = linSearch(array, 0, array.length-1, x);
        if (index != -1)
            System.out.println("\n The element " + x + " is present at position: " + index);
        else
            System.out.println("\n Element " + x + " is not present: ");


        System.out.println("\n 2b. Binary search recursive function");
        //to test the binary search with recursive function for array of string, program below

        String w = "Es krim";

        System.out.println("\n The elements to be searched in the array is: " + w);

        int result = binSearch(array, w);
        if (result == -1)
            System.out.println("\n Element " + w + " is not present: ");

        else
            System.out.println("\n The element " + w + " is present at position: " + result);


        System.out.println("\n 3. Binary tree");

        Tree intTree = new Tree();

        intTree.insert(124);
        intTree.insert(32);
        intTree.insert(27);
        intTree.insert(89);
        intTree.insert(245);
        intTree.insert(15);
        intTree.insert(9);
        intTree.insert(73);
        intTree.insert(98);
        intTree.insert(100);

        System.out.println("\n Traverse Order :");

        intTree.traverseInOrder();

        System.out.println("\n \n Max :");

        System.out.println(intTree.max());

        System.out.println("\n Min :");

        System.out.println(intTree.min());

        System.out.println("\n Elements size :");

        Tree tree = new Tree();
        tree.root = new TreeNode(124);
        tree.root.left = new TreeNode(32);
        tree.root.right = new TreeNode(27);
        tree.root.left.left = new TreeNode(89);
        tree.root.left.right = new TreeNode(245);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(9);
        tree.root.left.left.left= new TreeNode(73);
        tree.root.left.left.right = new TreeNode(98);
        tree.root.left.right.left = new TreeNode(100);


        System.out.println("The size of binary tree is : "
                + tree.size());
    }

    static int linSearch(String array[], int l, int r, String x) {
        if (r < l)
            return -1;
        if (array[l] == x)
            return l;
        if (array[r] == x)
            return r;
        return linSearch(array, l+1, r-1, x);
    }

    static int binSearch(String array[] , String w)
    {
        int l = 0, r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = w.compareTo(array[m]);

            if (res == 0)
                return m;

            if (res < 0)
                l = m + 1;

            else
                r = m - 1;
        }

        return -1;


    }

}