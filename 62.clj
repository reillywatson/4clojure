(fn itr [f x]
  (cons x (lazy-seq (itr f (f x)))))
