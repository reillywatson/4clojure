(fn r [x, y]
  (if (= x y) nil
  (cons x (r (+ 1 x) y))))
