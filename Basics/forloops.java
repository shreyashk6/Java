class forloops {
    public static void main(String[] args) {
        String[] names = {"Alex", "Ben", "Cathy"};

        // You have to manage the index 'i'
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // No index to manage. 'name' holds the current element.
        //FOR EACH LOOP SHORTCUT
        for (String name : names) {
            System.out.println(name);
        }

    }
}
