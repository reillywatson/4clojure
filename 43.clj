(fn a 
  ([x n] (a x n 1))
  ([x n reclevel]
  (if (= reclevel n)
    (list (take-nth n x))
    (cons (take-nth n x) (a (rest x) n (+ reclevel 1))))))
