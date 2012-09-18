(fn m [a b & rst]
  (if (= (count rst) 0)
    (if (> a b) a b)
    (m (apply m (cons a rst)) (apply m (cons b rst)))))
