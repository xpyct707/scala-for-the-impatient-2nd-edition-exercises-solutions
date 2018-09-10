package ch10

import scala.collection.mutable

abstract class Ex3 {
  val bs: mutable.BitSet
  val bitSetLin = "BitSet " +
    ">> lin(Serializable) " +
    ">> lin(SetLike) " +
    ">> lin(BitSetLike) " +
    ">> lin(BitSet{t}) " +
    ">> lin(SortedSet) " +
    ">> lin(AbstractSet)" +
  "= BitSet " +
    ">> (Serializable) " +
    ">> (SetLike " +
      ">> Parallelizable " +
      ">> (Cloneable " +
        ">> Cloneable[sc]) " +
      ">> Shrinkable" +
      ">> (Growable " +
        ">> Clearable) " +
      ">> (Builder " +
        ">> (Growable " +
          ">> Clearable)) " +
      ">> Scriptable " +
      ">> SetLike{col}" +
        ">> Parallelizable" +
        ">> Subtractable" +
        ">> (GenSetLike" +
          ">> Parallelizable" +
          ">> Equals" +
          ">> (GenIterableLike" +
            ">> (GenTraversableLike" +
              ">> Parallelizable" +
              ">> GenTraversableOnce)))" +
        ">> (IterableLike" +
          ">> (GenIterableLike" +
            ">> GenTraversableLike" +
            ">> Parallelizable" +
            ">> GenTraversableOnce)))" +
          ">> (TraversableLike" +
            ">> Parallelizable" +
            ">> (GenTraversableLike" +
              ">> Parallelizable" +
              ">> GenTraversableOnce)" +
            ">> (TraversableOnce" +
              ">> GenTraversableOnce)" +
            ">> FilterMonadic" +
            ">> HasNewBuilder)" +
          ">> Equals)" +
    ">> (BitSetLike" +
      ">> (SortedSetLike" +
        ">> (SetLike - db)" +
        ">> Sorted))" +
    ">> (BitSet{t}" +
      ">> (BitSetLike - db)" +
      ">> (SortedSet{col}" +
        ">> (SortedSetLike)" +
        ">> (Set{col}" +
          ">> SetLike - db" +
          ">> GenericSetTemplate" +
            ">> (GenericTraversableTemplate" +
              ">> HasNewBuilder - db))" +
          ">> (GenSet" +
            ">> GenericSetTemplate - db" +
            ">> (GenIterable" +
              ">> GenericTraversableTemplate - db" +
              ">> (GenTraversable" +
                ">> GenericTraversableTemplate - db" +
                ">> GenTraversableOnce" +
                ">> (GenTraversableLike - db))" +
              ">> (GenIterableLike - db)" +
              ">> (GenSetLike - db)))" +
          ">> (Iterable" +
            ">> IterableLike - db" +
            ">> GenericTraversableTemplate - db" +
            ">> GenIterable - db" +
            ">> (Traversable" +
              ">> GenericTraversableTemplate = db" +
              ">> TraversableOnce - db" +
              ">> GenTraversable - db" +
              ">> TraversableLike - db))))" +
    ">> (SortedSet{mut}" +
      ">> (SortedSet{col} - db))" +
    ">> (AbstractSet" +
      ">> (Set{mut}" +
        ">> SetLike{mut}" +
        ">> GenericSetTemplate" +
        ">> Set{col}" +
        ">> Iterable{mut})" +
      ">> AbstractIterable))"

}
