(fn m [x y]
  (if (= y 0)
    (first x)
    (m (rest x) (- y 1))))
