# ArrayList, HashSet, Iterator, HashMap  

```
 Book book1 = new Book(1, "To Kill A Mockingbird");
    Book book2 = new Book(2, "The Alchemist");
    Book book3 = new Book(3, "Of Mice And Men");
    Book book4 = new Book(4, "King Lear");
    Book book5 = new Book(1, "For whom the bell rings");
    Book book6 = new Book(6, "Harry Potter");
    Book book7 = new Book(7, "Chronicles of Narnia");
    Book book8 = new Book(8, "Pride and Prejudice");
    Book book9 = new Book(9, "The Litigation");

//    System.out.println(book1.equals(book3));

    List<Book> books = new ArrayList<>();
    books.add(book1);
    books.add(book2);
    books.add(book3);
    books.add(book4);
    books.add(book5);
    books.add(book6);
    books.add(book7);
    books.add(book8);
    books.add(book9);



    Set<Book> set = new HashSet<>();

    set.add(book1);
    set.add(book2);
    set.add(book3);
    set.add(book4);
    set.add(book5);

//    System.out.println(set.size());

    // few days later....
//    for (int i = 0; i < books.size(); i++){
//      System.out.println(books.get(i));
//    }

    // fancier iteration
//    for (Book cat: books){
//      cat.title = "Harry Potter";
//      System.out.println(cat);
//    }

    // [1, 2, 3, 4...               1000000 ]
    //           ^

    // iterator
//    Iterator<Book> i = set.iterator();
//    while (i.hasNext()){
//      Book book = i.next();
//      System.out.println(book);
//    }


    // HashMap *************************************
    // key, value
    HashMap<Integer, Book> map = new HashMap<>();

    for (Book b: books){
      map.put(b.id, b);
    }


    System.out.println("size of map: " + map.size());
    System.out.println("contains book id 5: " + map.containsKey(5));
    System.out.println("contains book id 6: " + map.containsKey(6));
    System.out.println("book id 1 " + map.get(1));

    System.out.println("Here are the keys");
    Set<Integer> keys = map.keySet();
    for (int key : keys){
      System.out.println(key);
    }

    System.out.println("Here are the books");

    for (Book book: map.values()){
      System.out.println(book);
    }
```
