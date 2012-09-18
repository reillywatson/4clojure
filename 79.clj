(fn minpath ([triangle] (minpath triangle 0))
  ([triangle index]
  (if (empty? triangle) 0
    (min
      (+ (nth (first triangle) index) (minpath (rest triangle) index))
      (+ (nth (first triangle) index) (minpath (rest triangle) (inc index)))
  ))))

