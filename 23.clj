(fn rev [x]
  (reduce #(cons %2 %1) () x))
