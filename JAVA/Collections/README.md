
**Collection (I) extends Iterable (I)**
    
    List (I), Set (I) and Queue (I) extends Collection (I) 
      ArrayList (C) implements List (I)
      Vector (C) implements List (I)
      LinkedList (C) implements List (I) and Queue (I)
      PriorityQueue (C) implements Queue (I)

    Set (I) extends Collection (I)
      HashSet (C) implements Set (I)
      LinkedHashSet (C) implements Set (I)
      SortedSet (I) extends Set (I)
        TreeSet (C) implements SortedSet (I)
        
**Map (I)**
    
    HashMap (C) implements Map (I)
    HashTable (C) implements Map (I)
    SortedMap (I) extends Map (I)
      TreeMap (C) implements SortedMap (I)
