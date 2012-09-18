(fn seqreduce
  ([f coll]
      (seqreduce f (first coll) (rest coll)))
  ([f init coll]
     (cons init
           (lazy-seq
            (when-let [s (seq coll)]
              (seqreduce f (f init (first s)) (rest s)))))))
