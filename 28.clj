(fn flat [l]
  (if (empty? l)
    nil
    (if (sequential? (first l))
      (concat (flat (first l)) (flat (rest l)))
      (cons (first l) (flat (rest l))))))
