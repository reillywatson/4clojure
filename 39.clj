(fn in [a b]
  (if (or (empty? a) (empty? b)) nil
  (concat (list (first a) (first b)) (in (rest a) (rest b)))))
