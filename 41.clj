(fn a [x y]
  (if (empty? x) '()
  (concat (take (- y 1) x) (a (nthnext x y) y))))
